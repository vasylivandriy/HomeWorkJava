package Task2;

import java.util.*;

public class Commodity extends Goods {


    static Scanner scan = new Scanner(System.in);
    static Set<Goods> goodsSet = new HashSet<>();

    public static void goodMain() {


        goodsSet.add(new Goods("Мило", 10, 5, 500));
        goodsSet.add(new Goods("Шампунь", 15, 8, 300));
        goodsSet.add(new Goods("Зубна щітка", 20, 2, 80));
        goodsSet.add(new Goods("Ноутбук", 500, 400, 5000));
        goodsSet.add(new Goods("Телефон", 10, 18, 800));
        goodsSet.add(new Goods("Монітор", 490, 396, 3400));
        goodsSet.add(new Goods("Губка для посуду", 10, 15, 50));
        goodsSet.add(new Goods("Гумка стиральна", 5, 3, 20));
        goodsSet.add(new Goods("Карта", 100, 50, 250));

    }


    public static void addGoods() {

        System.out.println("Input name");
        String name1 = scan.nextLine();

        System.out.println("Input length");
        Integer length1 = scan.nextInt();

        System.out.println("Input width");
        Integer width1 = scan.nextInt();

        System.out.println("Input weight");
        Integer weight1 = scan.nextInt();


        System.out.println("Before adding of the goods");
        for (Goods goods : goodsSet) {
            System.out.println(goods);
        }

        goodsSet.add(new Goods(name1, length1, width1, weight1));

        System.out.println("After adding of the goods");
        for (Goods goods : goodsSet) {
            System.out.println(goods);
        }

//
//    public void removeGoods () {
//    }
//
//    public void changeGoods () {
//    }
//
//    public void sortNameGoods () {
//    }
//
//    public void sortLengthGoods () {
//    }
//
//    public void sortWidthGoods () {
//    }
//
//    public void sortWeigthGoods () {
//    }
//
//    public void printElGoods () {
//    }
//
//    public void quitProgram () {
//
//        System.exit(1);
  }
    }

