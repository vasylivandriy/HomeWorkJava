package Task1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

       showMenu();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть будь ласка номер дії");

        int var = scan.nextInt();
if(var<=0&&var>10) System.out.println("Ви ввели неправильне число.");

    else {

        switch (var) {

            case 1: {
                System.out.println("Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр букв був неважливим )");

                System.out.println("Введіть місяць. Регістр немає значення");

                String mon = scan.next();

                for(Month: Month.values()){


                }

                  }
            break;
            case 2: {
                System.out.println("Вивести всі місяці з такою ж порою року");
            }
            break;
            case 3: {
                System.out.println("Вивести всі місяці які мають таку саму кількість днів");
            }
            break;
            case 4: {
                System.out.println("Вивести на екран всі місяці які мають меншу кількість днів");
            }
            break;
            case 5: {
                System.out.println("Вивести на екран всі місяці які мають більшу кількість днів");
            }
            break;
            case 6: {
                System.out.println("");
            }
            break;
            case 7: {
                System.out.println("");
            }
            break;
            case 8: {
                System.out.println("");
            }
            break;
            case 9: {
                System.out.println("");
            }
            break;
            case 10: {
                System.out.println("");
            }
            break;

        }

    }










    }

    private static void showMenu() {

        System.out.println("1: Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр букв був неважливим )");
        System.out.println("2: Вивести всі місяці з такою ж порою року");
        System.out.println("3: Вивести всі місяці які мають таку саму кількість днів");
        System.out.println("4: Вивести на екран всі місяці які мають меншу кількість днів");
        System.out.println("5: Вивести на екран всі місяці які мають більшу кількість днів");
        System.out.println("6: Вивести на екран наступну пору року");
        System.out.println("7: Вивести на екран попередню пору року");
        System.out.println("8: Вивести на екран всі місяці які мають парну кількість днів");
        System.out.println("9: Вивести на екран всі місяці які мають непарну кількість днів");
        System.out.println("10: Вивести на екран чи введений з консолі місяць має парну кількість днів");


    }


}


