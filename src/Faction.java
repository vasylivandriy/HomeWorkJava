import java.util.*;

public class Faction {

    static Scanner scan = new Scanner(System.in);

    static List<String> factionsList = new ArrayList<>();

    static public ArrayList<Delegate> delegatesArray = new ArrayList<>();

    static Iterator<Delegate> delegateIterator = delegatesArray.iterator();


    public static void main(String[] args) {

        factionsList.add("Україна");
        factionsList.add("До перемоги");
        factionsList.add("За Європу");


        delegatesArray.add(new Delegate("Романенко", "Роман", 51, true, "Україна", new Human(105, 190)));
        delegatesArray.add(new Delegate("Петренко", "Денис", 45, false, "Україна", new Human(70, 170)));
        delegatesArray.add(new Delegate("Розум", "Віталій", 36, false, "Україна", new Human(98, 173)));
        delegatesArray.add(new Delegate("Колода", "Петро", 78, false, "Україна", new Human(80, 172)));
        delegatesArray.add(new Delegate("Січкоріз", "Андрій", 59, true, "Україна", new Human(88, 185)));
        delegatesArray.add(new Delegate("Українець", "Панас", 63, false, "До перемоги", new Human(75, 181)));
        delegatesArray.add(new Delegate("Москаль", "Геннадій", 38, false, "До перемоги", new Human(120, 179)));
        delegatesArray.add(new Delegate("Перекотиполе", "Ігор", 40, false, "До перемоги", new Human(115, 176)));
        delegatesArray.add(new Delegate("Тягнибок", "Павло", 42, false, "До перемоги", new Human(110, 187)));
        delegatesArray.add(new Delegate("Герцог", "Іван", 45, true, "До перемоги", new Human(100, 193)));
        delegatesArray.add(new Delegate("Опанасенко", "Ярема", 43, true, "За Європу", new Human(91, 191)));
        delegatesArray.add(new Delegate("Гоблін", "Ярослав", 47, true, "За Європу", new Human(83, 184)));
        delegatesArray.add(new Delegate("Колода", "Олександр", 49, false, "За Європу", new Human(96, 175)));
        delegatesArray.add(new Delegate("Перебийніс", "Микола", 55, false, "За Європу", new Human(95, 178)));
        delegatesArray.add(new Delegate("Гаврилюк", "Гаврило", 57, true, "За Європу", new Human(77, 180)));

        cleanAllDelegatesF();


    }


    public void addDelegate() {

        System.out.println(

                "1. Input surname press enter, " +
                        "2. input name press enter," +
                        "3. input age press enter," +
                        "4. input true or false (BribeTaker or no) press enter," +
                        "5. input faction press enter, " +
                        "6. input weight press enter, " +
                        "7. input height press enter," +
                        " of a delegate to add him, please");


        String delegateNameAdd = scan.next();
        String delegateSurnameAdd = scan.next();
        Integer delegateAgeAdd = scan.nextInt();
        Boolean delegateBribeTakerAdd = scan.nextBoolean();
        String delegateFactionAdd = scan.next();
        Integer delegateWeightAdd = scan.nextInt();
        Integer delegateHeightAdd = scan.nextInt();

        delegatesArray.add(new Delegate(delegateSurnameAdd, delegateNameAdd, delegateAgeAdd, delegateBribeTakerAdd,
                delegateFactionAdd, new Human(delegateWeightAdd, delegateHeightAdd)));


        factionsList.add(delegateFactionAdd);

        new Delegate().bribeGive(delegateBribeTakerAdd);

        for (Delegate delegate : delegatesArray) {
            System.out.println(delegate);
        }

        for (String fact : factionsList) {
            System.out.println(fact);
        }

    }


    public void removeDelegate() {

        System.out.println("Input surname of a delegate to remove him, please");

        String delegateSurnameRemove = scan.next();


        for (Delegate delegate : delegatesArray) {

            if (delegate.getSurname().equalsIgnoreCase(delegateSurnameRemove))
                delegatesArray.remove(delegate);

        }


        for (Delegate delegate : delegatesArray) {
            System.out.println(delegate);
        }

        for (String fact : factionsList) {
            System.out.println(fact);
        }


    }


    public static void printAllBribesF() {

        System.out.println(" Input 1 for automatic genetation of bribeSize and 2 for inputting from keyboard");

        int line = scan.nextInt();

        switch (line) {

            case 1:

                for (Delegate delegate : delegatesArray) {

                    if (delegate.isBribeTaker()) {

                        delegate.setBribeSize(((int) (Math.random() * 5001)) + 3000);

                        System.out.println(delegate);
                        System.out.println("Bribe size = " + delegate.getBribeSize());

                        if (delegate.getBribeSize() > 5000)
                            System.out.println("Police arrest a delegate");
                        System.out.println();
                    }


                }
                break;

            case 2:
                for (Delegate delegate : delegatesArray) {
                    if (delegate.isBribeTaker()) {
                        System.out.println("For delegate: " + delegate.getSurname());
                        delegate.bribeGive(delegate.isBribeTaker());
                        System.out.println(delegate);
                        System.out.println();
                    }
                }
                break;
        }

    }


    public void printMostBribeF() {
        int mostSize = 0;
        for (Delegate delegate : delegatesArray) {

            if (delegate.isBribeTaker()) {
                int size = ((int) (Math.random() * 5001)) + 3000;
                delegate.setBribeSize(size);

                System.out.println(delegate);
                System.out.println("Bribe size = " + delegate.getBribeSize());

                if (delegate.getBribeSize() > 5000)
                    System.out.println("Police arrest a delegate");
                System.out.println();


            }


        }


    }

    public static void printAllDelegatesF() {

        for (String fact : factionsList) {
            System.out.println(fact);

        }

        System.out.println("Input faction for print delegades");

        String line = scan.nextLine();

        for (Delegate delegate : delegatesArray) {

            if (delegate.getFaction().equalsIgnoreCase(line)) {

                System.out.println(delegate);

            }

        }

    }

    public static void cleanAllDelegatesF() {

        for (String fact : factionsList) {
            System.out.println(fact);

        }

        System.out.println("Input faction for print delegades");

        String line1 = scan.nextLine();


        for (Delegate delegate : delegatesArray) {

            if (delegate.getFaction().equalsIgnoreCase(line1)) {
                delegatesArray.remove(delegate);
            }
        }
        for (String fact : factionsList) {
            if (fact.equalsIgnoreCase(line1))
            factionsList.remove(fact);

        }

        for (String fact : factionsList) {
            System.out.println(fact);

        }
        System.out.println();
        for (Delegate delegate1 : delegatesArray) {

            System.out.println(delegate1);



        }

    }


}