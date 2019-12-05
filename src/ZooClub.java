import java.security.KeyStore;
import java.util.*;

public class ZooClub {

    //    static List<Animal> listPet = new LinkedList<>();
    static List<Animal> listPet0 = new LinkedList<>();
    static List<Animal> listPet1 = new LinkedList<>();
    static List<Animal> listPet2 = new LinkedList<>();
    static List<Animal> listPet3 = new LinkedList<>();
    static List<Animal> listPet4 = new LinkedList<>();
    static List<Animal> listPet5 = new LinkedList<>();
    static List<Animal> listPet6 = new LinkedList<>();


    static Map<Person, List<Animal>> hashMap = new HashMap<>();
    static Set<Map.Entry<Person, List<Animal>>> entryset = hashMap.entrySet();

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        listPet0.add(new Animal("Cat", "Sara"));
        listPet0.add(new Animal("Dog", "Barsik"));

        listPet1.add(new Animal("Cat", "Vovk"));
        listPet1.add(new Animal("Dog", "Mamba"));

        listPet2.add(new Animal("Cat", "Ostap"));
        listPet2.add(new Animal("Dog", "Stepan"));

        listPet3.add(new Animal("Cat", "Laki"));
        listPet3.add(new Animal("Dog", "Rex"));

        listPet4.add(new Animal("Cat", "Koshak"));
        listPet4.add(new Animal("Dog", "Peppi"));

        listPet5.add(new Animal("Cat", "Basia"));
        listPet5.add(new Animal("Dog", "Alba"));

        listPet5.add(new Animal("Cat", "Lida"));
        listPet5.add(new Animal("Dog", "Tsyhan"));


        hashMap.put(new Person("Garret", 13), listPet0);
        hashMap.put(new Person("Anton", 56), listPet1);
        hashMap.put(new Person("Taras", 18), listPet2);
        hashMap.put(new Person("Vadym", 36), listPet3);
        hashMap.put(new Person("Solomia", 10), listPet4);
        hashMap.put(new Person("Hanna", 80), listPet5);
        hashMap.put(new Person("Olha", 45), listPet6);


        showMenu();
        System.out.println("Input number of action");
        int line = scan.nextInt();

        switch (line) {

            case 1:
                addPersonToMap();
                break;
            case 2:
                addPetToPerson();
                break;
            case 3:
                // removePetOfPerson();
                break;
            case 4:
                //removePersonOfMap();
                break;
            case 5:
                // removePetOfAllPerson();
                break;
            case 6:
                // printZooClub();
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


    private static void addPersonToMap() {

        for (Map.Entry<Person, List<Animal>> map : hashMap.entrySet())

            System.out.println(map);

        System.out.println("Input person name");

        String personName = scan.next();

        System.out.println("Input person age");
        Integer personAge = scan.nextInt();

        hashMap.put(new Person(personName, personAge), new LinkedList<Animal>());


        for (Map.Entry<Person, List<Animal>> map : hashMap.entrySet())

            System.out.println(map);
    }


    private static void addPetToPerson() {


        for (Map.Entry<Person, List<Animal>> map : hashMap.entrySet())

            System.out.println(map);

        System.out.println("Input name of a person for adding of a pet");
        String namePerson = scan.next();

        System.out.println("Input age of a person for adding of a pet");
        Integer agePerson = scan.nextInt();

        for (Map.Entry<Person, List<Animal>> map : hashMap.entrySet()){

            if (map.getKey().getName().equalsIgnoreCase(namePerson)&&map.getKey().getAge().equals(agePerson)){

                System.out.println("Input type of an animal - cat or dog");
                String typeAnimal = scan.next();

                System.out.println("Input name of an animal");
                String nameAnimal = scan.next();

                hashMap.get(map).add(new Animal(typeAnimal,nameAnimal));

               break;
            }

        }



        for (Map.Entry<Person, List<Animal>> map : hashMap.entrySet())

            System.out.println(map);
    }


//    private static void removePetToPerson() {
//
//
//    }
//
//
//    private static void removePersonOfMap() {
//
//        for (Map.Entry<Person, Object> map : setMap)
//
//            System.out.println(map);
//
//        System.out.println("Input person name for removing");
//
//        String personName = scan.next();
//
//        System.out.println("Input person age");
//        Integer personAge = scan.nextInt();
//
//        for (Map.Entry<Person, Object> map : setMap) {
//
//            if (map.getKey().getName().equalsIgnoreCase(personName) || map.getKey().getAge().equals(personAge)) {
//
//                setMap.remove(map);
//            }
//        }
//
//        for (Map.Entry<Person, Object> map : setMap)
//
//            System.out.println(map);
//
//
//    }
//
//
//    private static void removePetOfAllPerson() {
//
//        System.out.println("Before removing pets");
//        for (Map.Entry<Person, Object> map : setMap) {
//            System.out.println(map);
//        }
//        System.out.println();
//
//        System.out.println("Input name of a pet for removing");
//        String namePet = scan.next();
//
//        int a = 0;
//
//        for (Animal animal1 : listPet) {
//
//            if (animal1.getNameAnimal().equalsIgnoreCase(namePet)) {
//
//                a = listPet.indexOf(animal1);
//                break;
//            }
//        }
//
//        System.out.println("Index of a pet for removing");
//
//        listPet.remove(a);
//
//        System.out.println();
//        System.out.println("After removing pets");
//        for (Map.Entry<Person, Object> map : setMap) {
//            System.out.println(map);
//        }
//
//    }
//
//
//    private static void printZooClub() {
//
//        for (Map.Entry<Person, Object> map : setMap)
//            System.out.println(map);
//
//    }

    private static void programExit() {

        System.exit(0);
    }


}
