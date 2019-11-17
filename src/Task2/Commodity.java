package Task2;

import java.util.*;

public class Commodity {


    static Scanner scan = new Scanner(System.in);
    static List<Goods> goodsSet = new ArrayList<>();

    public static void main(String[] args) {


        goodsSet.add(new Goods("Мило", 10, 5, 500));
        goodsSet.add(new Goods("Шампунь", 15, 8, 300));
        goodsSet.add(new Goods("Зубна щітка", 20, 2, 80));
        goodsSet.add(new Goods("Ноутбук", 500, 400, 5000));
        goodsSet.add(new Goods("Телефон", 10, 18, 800));
        goodsSet.add(new Goods("Монітор", 490, 396, 3400));
        goodsSet.add(new Goods("Губка для посуду", 10, 15, 50));
        goodsSet.add(new Goods("Гумка стиральна", 5, 3, 20));
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
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
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
//
//Object endadd = new Goods(name1, length1, width1, weight1);
//        return endadd;

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

//    public static void changeGoods() {
//
//        for (Goods goods : goodsSet) {
//            System.out.println(goods);
//        }
//
//        System.out.println("Input name of a goods to change");
//        String name1 = scan.nextLine();
//
//
//        for (Goods goods : goodsSet) {
//            if (goods.getName().equalsIgnoreCase(name1))
//                goodsSet.remove(goods);
//
//        }
//
//
//        System.out.println();
//        System.out.println("After removing of the goods");
//        for (Goods goods : goodsSet) {
//            System.out.println(goods);
//        }
//
//    }
//
//    public void sortNameGoods() {
//
//
//    }

    //    public void sortLengthGoods () {
//    }
//
//    public void sortWidthGoods () {
//    }
//
//    public void sortWeigthGoods () {
//    }
//





    public void printElGoods() {

        for (Goods goods : goodsSet) {
            System.out.println(goods);
        }

        System.out.println("Input index of the goods");
        int indexGoods = scan.nextInt();

        System.out.println(goodsSet.get(indexGoods));

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
        System.out.println("8. Вивести і-й елемент колекції");
        System.out.println("9. Вийти з програми");

    }


}

