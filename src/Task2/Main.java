package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Automobile automobile = new Automobile();


        int[][] auto = new int[10][10];

        for (int i = 0; i <auto.length ; i++) {

            for (int j = 0; j <auto[i].length ; j++) {

                auto[i][j]=(int)(Math.random()*10);

            }

        }

        System.out.println(Arrays.deepToString(auto));;




//        showMenu();
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please select an action");
//
//       String line = scan.next();
//
//        while(!line.equalsIgnoreCase("quite")){
//
//            switch (line){
//
//                case "a":
//                    System.out.println("a");break;
//                case "b":
//                    System.out.println("b"); break;
//                case "c":
//                    System.out.println("c"); break;
//                case "d":
//                    System.out.println("d"); break;
//
//            }
//
//
//
//        }
//
    }



public static void showMenu(){
    System.out.println("a) вивести toString() даних елементів масиву на консоль. ( deepToString() )");
    System.out.println("b) для всіх обєктів даного масиву засетати одне значення будьякого поля класу Авто (fill())");
    System.out.println("c) відсортувати за спаданням всі обєкти за введеним полем");
    System.out.println("d) відсортувати за зростанням всі обєкти за введеним полем");

}

}
