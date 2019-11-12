package Task1;

import java.awt.List;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        String[] names = {"BMW", "Lada", "Koenigsegg", "Toyota", "Ferrari", "Lamborgini", "Zaporoghets", "Mazerati", "Bentley", "Ford", "Porshe"};

        Integer[] ages = {1986, 1991, 1993, 1995, 1997, 1999, 2001, 2003, 2006, 2008, 2010, 2015, 2019};

        Integer[] horsePowers = {150, 165, 170, 175, 180, 190, 200, 210, 220, 250, 255, 280, 300, 500, 650};

        Integer[] cylindersNumbers = {2, 4, 6, 8, 10, 12, 14, 16};

        Integer[] diametrWheel = {19, 20, 21, 22, 23};

        String[] materials = {"Skin", "Alcantara"};


        int size = (int) (Math.random() * 10);

        ArrayList<Automobile> automobiles = new ArrayList<>();


        for (int i = 0; i < size; i++) {


            automobiles.add(new Automobile((Integer) getRandomValue(ages, 0, ages.length), (Integer)
                    getRandomValue(horsePowers, 0, horsePowers.length), (String) getRandomValue(names, 0, names.length),
                    new Engine((Integer) getRandomValue(cylindersNumbers, 0, cylindersNumbers.length)),
                    new Helm((Integer) getRandomValue(diametrWheel, 0, diametrWheel.length),
                            (String) getRandomValue(materials, 0, materials.length))));

        }


///////////////////////////////////////////////////////////////////////////////


        showMenu();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please select an action");

        String line = scan.next();


        switch (line) {

            case "a":
                System.out.println(automobiles);
                break;

            case "b":
//                    //  Collections.fill(new ArrayList<>(), getRandomValue(names,0,names.length));
//
//                    Collections.fill(List automobiles, 5);
//
//                    System.out.println(automobiles);
//
//                    //       Automobile jhdf = new Automobile(1,2,new Engine(1),new Helm(1, "45656"));
//
//
//                    //  Automobile automobile = new Automobile();
                break;

            case "c":
                System.out.println("Input field for sorting");
                String field = scan.next();

                switch (field) {

                    case "name":

                        automobiles.sort(Comparator.comparing(Automobile::getName));

                        for (int i = 0; i < size; i++) {

                            System.out.println(automobiles.get(i));
                        }
                        break;
                    case "age":
                        automobiles.sort(Comparator.comparing(Automobile::getAge));

                        for (int i = 0; i < size; i++) {

                            System.out.println(automobiles.get(i));
                        }
                        break;

                    case "horsepower":
                        automobiles.sort(Comparator.comparing(Automobile::getHorsePower));

                        for (int i = 0; i < size; i++) {

                            System.out.println(automobiles.get(i));
                        }
                        break;
                }
                break;
            case "d":
                System.out.println("Input field for reverse sorting");
                String field1 = scan.next();

                switch (field1) {

                    case "name":

                        automobiles.sort(Comparator.comparing(Automobile::getName).reversed());

                        for (int i = 0; i < size; i++) {

                            System.out.println(automobiles.get(i));
                        }
                        break;
                    case "age":
                        automobiles.sort(Comparator.comparing(Automobile::getAge).reversed());

                        for (int i = 0; i < size; i++) {

                            System.out.println(automobiles.get(i));
                        }
                        break;

                    case "horsepower":
                        automobiles.sort(Comparator.comparing(Automobile::getHorsePower).reversed());

                        for (int i = 0; i < size; i++) {

                            System.out.println(automobiles.get(i));
                        }
                        break;
                }


        }


    }

    private static Object getRandomValue(Object[] array, int min, int max) {

        if (min > max) throw new IllegalArgumentException();

        Random random = new Random();

        int randomInt = random.nextInt(max - min);

        return array[randomInt];


    }


    public static void showMenu() {
        System.out.println("a) вивести toString() даних елементів масиву на консоль. ( deepToString() )");
        System.out.println("b) для всіх обєктів даного масиву засетати одне значення будьякого поля класу Авто (fill())");
        System.out.println("c) відсортувати за спаданням всі обєкти за введеним полем");
        System.out.println("d) відсортувати за зростанням всі обєкти за введеним полем");

    }

}
