package Task1;

import java.util.*;

public class MainVegetables {


    private static Object Vegetables;

    public static void main(String[] args) {

//        Set<Vegetables> vegetables = new TreeSet<>();
        //  Set<Vegetables> vegetables = new LinkedHashSet<>();
          List<Vegetables> vegetables = new LinkedList<>();



        vegetables.add(new Vegetables("Буряк", 18,"Червоний"));
        vegetables.add(new Vegetables("Капуста", 16,"Зелений"));
        vegetables.add(new Vegetables("Капуста", 14,"Зелений"));
        vegetables.add(new Vegetables("Капуста", 14,"Червоний"));
        vegetables.add(new Vegetables("Огірок", 20,"Зелений"));
        vegetables.add(new Vegetables("Цибуля", 23,"Коричневий"));
        vegetables.add(new Vegetables("Петрушка", 13,"Білий"));
        vegetables.add(new Vegetables("Селера", 15,"Білий"));
        vegetables.add(new Vegetables("Морква", 22,"Оранжевий"));


        for (Vegetables veget: vegetables ) {
            System.out.println(veget);
        }
        System.out.println();

Collections.sort(vegetables,new NameComparator());

        for (Vegetables veget: vegetables ) {
            System.out.println(veget);
        }
    }
}
