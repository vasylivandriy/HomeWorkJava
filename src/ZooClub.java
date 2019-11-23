import java.util.*;

public class ZooClub {

    static List<Animal> listPet = new LinkedList<>();

    static Map<Person, Object> hashMap = new HashMap<>();


    static Set<Map.Entry<Person, Object>> setMap = hashMap.entrySet();


    static Iterator<Map.Entry<Person, Object>> iterator = hashMap.entrySet().iterator();

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        listPet.add(new Animal("Cat", "Sara"));
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
                addPersonToMap();
                break;
            case 2:
                addPetToPerson();
                break;
            case 3:
                // removePetOfPerson();
                break;
            case 4:
                removePersonOfMap();
                break;
            case 5:
                removePetOfAllPerson();
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


    private static void addPersonToMap() {

        for (Map.Entry<Person, Object> map : setMap)

            System.out.println(map);

        System.out.println("Input person name");

        String personName = scan.next();

        System.out.println("Input person age");
        Integer personAge = scan.nextInt();

        hashMap.put(new Person(personName, personAge), listPet);

        for (Map.Entry<Person, Object> map : setMap)

            System.out.println(map);
    }


    private static void addPetToPerson() {


        for (Map.Entry<Person, Object> map : setMap)
            System.out.println(map);
//
//        System.out.println("Input name of a person for adding of a pet");
//        String namePerson = scan.next();
//
//        System.out.println("Input age of a person for adding of a pet");
//        Integer agePerson = scan.nextInt();


//                System.out.println("Input type of an animal - cat or dog");
//                String typeAnimal = scan.next();
//
//                System.out.println("Input name of an animal");
//                String nameAnimal = scan.next();


        for (Map.Entry<Person, Object> map1 : setMap) {
            if (map1.getKey().getName().equalsIgnoreCase("olha") && map1.getKey().getAge().equals(45)) {

                listPet.add(new Animal("cat", "ssdgsgsdg"));
                map1.setValue(listPet);

            }
        }

        System.out.println();
        for (Map.Entry<Person, Object> map2 : setMap)

            System.out.println(map2);
    }


    private static void removePetToPerson() {


    }


    private static void removePersonOfMap() {

        for (Map.Entry<Person, Object> map : setMap)

            System.out.println(map);

        System.out.println("Input person name for removing");

        String personName = scan.next();

        System.out.println("Input person age");
        Integer personAge = scan.nextInt();

        for (Map.Entry<Person, Object> map : setMap) {

            if (map.getKey().getName().equalsIgnoreCase(personName) || map.getKey().getAge().equals(personAge)) {

                setMap.remove(map);
            }
        }

        for (Map.Entry<Person, Object> map : setMap)

            System.out.println(map);


    }


    private static void removePetOfAllPerson() {

        System.out.println("Before removing pets");
        for (Map.Entry<Person, Object> map : setMap) {
            System.out.println(map);
        }
        System.out.println();

        System.out.println("Input name of a pet for removing");
        String namePet = scan.next();

        int a = 0;

        for (Animal animal1 : listPet) {

            if (animal1.getNameAnimal().equalsIgnoreCase(namePet)) {

                a = listPet.indexOf(animal1);
                break;
            }
        }

        System.out.println("Index of a pet for removing");

        listPet.remove(a);

        System.out.println();
        System.out.println("After removing pets");
        for (Map.Entry<Person, Object> map : setMap) {
            System.out.println(map);
        }

    }


    private static void printZooClub() {

        for (Map.Entry<Person, Object> map : setMap)
            System.out.println(map);

    }

    private static void programExit() {

        System.exit(0);
    }


}
