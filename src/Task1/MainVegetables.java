//package Task1;
//
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Set;
//
//public class MainVegetables{
//
//    public static void main(String[] args) {
//
//        Set<Vegetables> vegetables = new HashSet<>();
//
//        vegetables.add(new Vegetables("Буряк", 18,"Червоний"));
//        vegetables.add(new Vegetables("Капуста", 14,"Зелений"));
//        vegetables.add(new Vegetables("Огірок", 20,"Зелений"));
//        vegetables.add(new Vegetables("Цибуля", 23,"Коричневий"));
//        vegetables.add(new Vegetables("Петрушка", 13,"Білий"));
//        vegetables.add(new Vegetables("Селера", 15,"Білий"));
//        vegetables.add(new Vegetables("Морква", 22,"Оранжевий"));
//
//        System.out.println("Non sorted array");
//        for (Vegetables veget: vegetables  ) {
//            System.out.println(veget);
//        }
//
//        System.out.println("--------------------------------------------");
//        System.out.println("sorted array by using Comparable");
//        Collections.sort(vegetables);
//
//
//    }
//}
