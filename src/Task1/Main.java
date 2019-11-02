package Task1;

import java.util.Scanner;

public class Main {

  static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

       showMenu();

       System.out.println("Введіть будь ласка номер дії");
        int var = scan.nextInt();

if(var<=0||var>10) System.out.println("Ви ввели неправильне число.");

    else {

        switch (var) {

            case 1: {

                    searchMonth();
                    showMenu();
                    searchMonth();
            break;
            }
            case 2: {
                System.out.println("Вивести всі місяці з такою ж порою року");

                System.out.println("Input season, please");
            String season2 =scan.next();
boolean find = false;
            for(Seasons seas : Seasons.values()){

                if (seas.name().equalsIgnoreCase(season2))
                    System.out.println("Yes. Such season exists!");

                  }

               if(!find)
                System.out.println("O, no!!! Such season does not exist!");


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


   static private void searchMonth(){

        boolean find1 =false;

        System.out.println("Введіть місяць. Регістр немає значення");
        String mon = scan.next();

                    for (Month month : Month.values()) {

                if (month.name().equalsIgnoreCase(mon)){
                    System.out.println("Такий місяць існує");

                find1 =true; }

            }

                    if(!find1){ System.out.println("Such month does not exist"); }



	}



    }





