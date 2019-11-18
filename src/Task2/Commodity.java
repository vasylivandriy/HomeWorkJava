package Task2;

import java.util.*;

public class Commodity {


    static Scanner scan = new Scanner(System.in);
    static Set<Goods> goodsSet = new TreeSet<>(new SortingLength());

    static Iterator<Goods> iterator = goodsSet.iterator();

    public static void main(String[] args) {


        goodsSet.add(new Goods("Мило", 10, 5, 500));
        goodsSet.add(new Goods("Шампунь", 15, 8, 300));
        goodsSet.add(new Goods("Зубна_щітка", 20, 2, 80));
        goodsSet.add(new Goods("Ноутбук", 500, 400, 5000));
        goodsSet.add(new Goods("Телефон", 10, 18, 800));
        goodsSet.add(new Goods("Монітор", 490, 396, 3400));
        goodsSet.add(new Goods("Губка_для_посуду", 10, 15, 50));
        goodsSet.add(new Goods("Гумка_стиральна", 5, 3, 20));
        goodsSet.add(new Goods("Карта", 100, 50, 250));

        menuShow();
        System.out.println("Input number");
        int line = scan.nextInt();

        switch (line) {
            case 1:
                addGoods();
                break;
            case 2:
                removeGoods();
                break;
            case 3:
                changeGoods();
                break;
            case 4:
                sortNameGoods();
                break;
            case 5:
                sortLengthGoods();
                break;
            case 6:
                sortWidthGoods();
                break;
            case 7:
                sortWeigthGoods();
                break;
            case 8:
                printElGoods();
                break;
            case 9:
                quitProgram();
                break;


        }


    }


    private static void addGoods() {

        System.out.println("Input name");
        String name1 = scan.next();

        System.out.println("Input length");
        int length1 = scan.nextInt();

        System.out.println("Input width");
        int width1 = scan.nextInt();

        System.out.println("Input weight");
        int weight1 = scan.nextInt();


        System.out.println("Before adding of the goods");
        for (Goods goods : goodsSet) {
            System.out.println(goods);
        }

        goodsSet.add(new Goods(name1, length1, width1, weight1));


        System.out.println();
        System.out.println("After adding of the goods");
        for (Goods goods : goodsSet) {
            System.out.println(goods);
        }


    }

    public static void removeGoods() {

        for (Goods goods : goodsSet) {
            System.out.println(goods);
        }

        System.out.println("Input name of a goods to remove");
        String name1 = scan.next();


        for (Goods goods : goodsSet) {
            if (goods.getName().equalsIgnoreCase(name1))
                goodsSet.remove(goods);

        }


        System.out.println();
        System.out.println("After removing of the goods");
        for (Goods goods : goodsSet) {
            System.out.println(goods);
        }


    }

    public static void changeGoods() {

        for (Goods goods : goodsSet) {
            System.out.println(goods);
        }

        System.out.println("Input name of a goods to change");
        String name2 = scan.next();


        while (iterator.hasNext()) {

            if (iterator.next().getName().equalsIgnoreCase(name2))
                iterator.remove();
        }


        System.out.println("Input name");
        String name1 = scan.next();

        System.out.println("Input length");
        int length1 = scan.nextInt();

        System.out.println("Input width");
        int width1 = scan.nextInt();

        System.out.println("Input weight");
        int weight1 = scan.nextInt();


        goodsSet.add(new Goods(name1, length1, width1, weight1));


        System.out.println();

        for (Goods goods : goodsSet) {
            System.out.println(goods);
        }

    }

    public static void sortNameGoods() {

        // Пишемо в круглих дужках TreeSet new SortingName()
    }

    public static void sortLengthGoods() {

        // Пишемо в круглих дужках TreeSet new SortingLength()
    }


    public static void sortWidthGoods() {

        // Пишемо в круглих дужках TreeSet new SortingWidth()
    }

    public static void sortWeigthGoods() {

        // Пишемо в круглих дужках TreeSet new SortingWeight()
    }


    public static void printElGoods() {

        for (Goods goods : goodsSet) {
            System.out.println(goods);
        }

        System.out.println("Input goods to print");
        String inputGoods = scan.next();

        for (Goods g : goodsSet) {
            if (g.getName().equalsIgnoreCase(inputGoods))

                System.out.println(g);
        }

        while (iterator.hasNext()) {

            if (iterator.next().equals(inputGoods))

                System.out.println(iterator.next());
        }
    }


    public static void quitProgram() {

        System.exit(1);
    }

    private static void menuShow() {

        System.out.println("1. Додати товар");
        System.out.println("2. видалити товар");
        System.out.println("3. Замінити товар");
        System.out.println("4. Сортувати за назвою");
        System.out.println("5. Сортувати за довжиною");
        System.out.println("6. Сортувати за шириною");
        System.out.println("7. Сортувати за вагою");
        System.out.println("8. Вивести елемент колекції");
        System.out.println("9. Вийти з програми");

    }


}

