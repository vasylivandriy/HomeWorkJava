import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



   VerkhovnaRada verkhovnaRada = new VerkhovnaRada();


        Scanner scan = new Scanner(System.in);

        menuShow();
        String line = scan.next();

        while (line.equalsIgnoreCase("quit")) {

            switch (line) {

                case "1": verkhovnaRada.addFaction(); break;
                case "2": verkhovnaRada.removeFaction(); break;
                case "3": verkhovnaRada.printAllFaction(); break;
                case "4": verkhovnaRada.cleanFaction(); break;
                case "5": verkhovnaRada.printFaction(); break;
                case "6": verkhovnaRada.addDelegateFaction(); break;
                case "7": verkhovnaRada.deleteDelegateFaction(); break;
                case "8": verkhovnaRada.printListBribers(); break;
                case "9": verkhovnaRada.printMostBriber(); break;

            }

        }
    }





    public static void menuShow() {

        System.out.println("Choose the item");
        System.out.println("1. Add Faction");
        System.out.println("2. Remove Faction");
        System.out.println("3. Print all Factions");
        System.out.println("4. Clean Faction");
        System.out.println("5. Print Faction");
        System.out.println("6. Add Delegate to Faction");
        System.out.println("7. Delete Delegate of Faction");
        System.out.println("8. Print List of Bribers");
        System.out.println("9. Print the Most Briber");


    }



}
