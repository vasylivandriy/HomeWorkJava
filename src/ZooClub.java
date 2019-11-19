import java.util.*;

public class ZooClub {

    static List<Object> listPet = new LinkedList<>();
    static Map<Object, Object> hashMap = new HashMap<>();
    static Set<Map.Entry<Object, Object>> setMap = hashMap.entrySet();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        listPet.add(new Animal("Cat", "Sanra"));
        listPet.add(new Animal("Cat", "Barsik"));
        listPet.add(new Animal("Cat", "Vovk"));
        listPet.add(new Animal("Dog", "Mamba"));
        listPet.add(new Animal("Dog", "Ostap"));


        hashMap.put(new Person("Anton", 56), listPet);
        hashMap.put(new Person("Taras", 18), listPet);
        hashMap.put(new Person("Vadym", 36), listPet);
        hashMap.put(new Person("Solomia", 10), listPet);
        hashMap.put(new Person("Hanna", 80), listPet);
        hashMap.put(new Person("Olha", 45), listPet);

        showMenu();
        System.out.println("Input number of action");
        int line = scan.nextInt();

        switch (line) {

            case 1:
                addPersonMap();
                break;
            case 2:
                addPetToPerson();
                break;
            case 3:
                removePetToPerson();
                break;
            case 4:
                removePerson();
                break;
            case 5:
                removePetForAllPerson();
                break;
            case 6:
                printZooClub();
                break;
            case 7:
                programExit();
                break;


        }


    }

    private static void showMenu() {

        System.out.println("1. Додати учасника клубу");
        System.out.println("2. Додати тварину до учасника клубу");
        System.out.println("3. Видалити тварину з учасника клубу");
        System.out.println("4. Видалити учасника клубу");
        System.out.println("5. Видалити конкреткну тварину зі всіх власників");
        System.out.println("6. Вивести на екран зооклуб");
        System.out.println("7. Вийти з програми");

    }


    private static void addPersonMap() {

        for (Map.Entry<Object, Object> map : setMap)

            System.out.println(map);

        System.out.println("Input person name");

        String personName = scan.next();

        System.out.println("Input person age");
        Integer personage = scan.nextInt();

        hashMap.put(new Person(personName, personage), listPet);

        for (Map.Entry<Object, Object> map : setMap)

            System.out.println(map);
    }




    private static void addPetToPerson() {

        for (Map.Entry<Object, Object> map : setMap)
            System.out.println(map);

        System.out.println("Input name of a person for adding of a pet");
        String namePerson = scan.next();

        System.out.println("Input type of an animal - cat or dog");
        String typeAnimal = scan.next();

        System.out.println("Input name of an animal");
        String nameAnimal = scan.next();

        for (Map.Entry<Object, Object> map : setMap)

            if (map.getKey(new))

                System.out.println(map);

    }


    private static void removePetToPerson() {
    }

    private static void removePerson() {
    }

    private static void removePetForAllPerson() {
    }








    private static void printZooClub() {

        for (Map.Entry<Object, Object> map : setMap)
            System.out.println(map);

    }

    private static void programExit() {

        System.exit(0);
    }


}
