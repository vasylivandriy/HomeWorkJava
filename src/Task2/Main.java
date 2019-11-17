package Task2;

import java.util.*;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Seasons> seasonList = new ArrayList<>();

    public static void main(String[] args) {



        seasonList.add(new Seasons("Winter", "JANUARY", 31));
        seasonList.add(new Seasons("Winter", "FEBRUARY", 28));
        seasonList.add(new Seasons("Spring", "MARCH", 31));
        seasonList.add(new Seasons("Spring", "April", 30));
        seasonList.add(new Seasons("Spring", "May", 31));
        seasonList.add(new Seasons("Summer", "June", 30));
        seasonList.add(new Seasons("Summer", "July", 31));
        seasonList.add(new Seasons("Summer", "August", 31));
        seasonList.add(new Seasons("Autumn", "September", 30));
        seasonList.add(new Seasons("Autumn", "October", 31));
        seasonList.add(new Seasons("Autumn", "November", 30));
        seasonList.add(new Seasons("Winter", "December", 31));


        showMenu();

        System.out.println("Введіть будь ласка номер дії");

        int var = scan.nextInt();

        if (var <= 0 || var > 10) System.out.println("Ви ввели неправильне число.");

        else {

            switch (var) {

                case 1:
                    searchMonth();
                    break;

                case 2:
                    searchSeason();
                    break;

                case 3:
                    suchNumberDays();
                    break;

                case 4:
                    lessNumberDays();
                    break;

                case 5:
                    moreNumberDays();
                    break;

                case 6:
                    nextSeason();
                    break;

                case 7:
                    beforeSeason();
                    break;

                case 8:
                    monthsEvenDays();
                    break;

                case 9:
                    monthsNonEvenDays();
                    break;

                case 10:
                    monthHasPairNumberDays();
                    break;
//
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


    static private void searchMonth() {

        boolean find1 = false;

        System.out.println("Введіть місяць. Регістр немає значення");
        String mon = scan.next();

        for (Seasons seas : seasonList) {

            if (seas.getMonth().equalsIgnoreCase(mon)) {
                System.out.println("Такий місяць існує");

                find1 = true;
            }

        }

        if (!find1) {
            System.out.println("Such month does not exists");
        }


    }


    static private void searchSeason() {

        boolean find = false;

        System.out.println("Input month, please");
        String month2 = scan.next();

        for (Seasons seas : seasonList) {

            if (seas.getMonth().equalsIgnoreCase(month2)) {

                System.out.println(seas.getSeason());

                for (Seasons seas2 : seasonList) {

                    if (seas.getSeason().equals(seas2.getSeason()))
                        System.out.println(seas2.getMonth());


                }
                find = true;

            }
        }

        if (!find) {
            System.out.println("O, no!!! Such season does not exists!");
        }

    }


    static private void suchNumberDays() {

        boolean find1 = false;

        System.out.println("Введіть місяць. Регістр немає значення");
        String mon = scan.next();

        for (Seasons seas : seasonList) {

            if (seas.getMonth().equalsIgnoreCase(mon)) {
                int day = seas.getDays();

                for (Seasons seas2 : seasonList) {

                    if (seas2.getDays().equals(day))
                        System.out.println(seas2.getMonth());
                }


                find1 = true;
            }

        }

        if (!find1) {
            System.out.println("Such month does not exist");
        }
    }

    static private void lessNumberDays() {

        boolean find1 = false;

        System.out.println("Введіть місяць. Регістр немає значення");
        String mon = scan.next();

        for (Seasons seas : seasonList) {

            if (seas.getMonth().equalsIgnoreCase(mon)) {
                int day = seas.getDays();

                for (Seasons seas2 : seasonList) {

                    if (seas2.getDays() < day)
                        System.out.println(seas2.getMonth());
                }


                find1 = true;
            }

        }

        if (!find1) {
            System.out.println("Such month does not exist");
        }
    }


    static private void moreNumberDays() {

        boolean find1 = false;

        System.out.println("Введіть місяць. Регістр немає значення");
        String mon = scan.next();

        for (Seasons seas : seasonList) {

            if (seas.getMonth().equalsIgnoreCase(mon)) {
                int day = seas.getDays();

                for (Seasons seas2 : seasonList) {

                    if (seas2.getDays() > day)
                        System.out.println(seas2.getMonth());
                }


                find1 = true;
            }

        }

        if (!find1) {
            System.out.println("Such month does not exist");
        }
    }


    static private void nextSeason() {

        boolean find = false;

        System.out.println("Input season, please");
        String season2 = scan.next();

        for (Seasons seas : seasonList) {

            if (seas.getSeason().equalsIgnoreCase(season2)) {

                for (Seasons seas2 : seasonList) {

                    if (!seas.getSeason().equalsIgnoreCase(seas2.getSeason())) {
                        System.out.println("Next Season is: " + seas2.getSeason());

                        break;
                    }

                }


                find = true;
            }

        }

        if (!find) {
            System.out.println("O, no!!! Such season does not exist!");
        }
    }


    static private void beforeSeason() {

        boolean find = false;

        System.out.println("Input season, please");
        String season2 = scan.next();

        for (Seasons seas : seasonList) {

            if (seas.getSeason().equalsIgnoreCase(season2)) {

                int place = seasonList.indexOf(seas);

                for (int i = 0; i<seasonList.size(); i++) {

                    if (seasonList.get(i).equals(seasonList.get(place))) {

                        if (seasonList.indexOf(seasonList.get(i))==0)
                        {System.out.println("Before season is: " + seasonList.get( seasonList.size() - 1).getSeason()); break;}
                        else {System.out.println("Before season is: " + seasonList.get(i - 1).getSeason()); break;}
                    }
                find = true;}
            }
        }

        if (!find) {
            System.out.println("O, no!!! Such season does not exist!");
        }


    }


    static private void monthsEvenDays() {

        System.out.println("Months with even number of days: ");

        for (Seasons seas : seasonList) {

            int days = seas.getDays();

            if (days % 2 == 0)

                System.out.println(seas.getMonth());
        }

    }

    static private void monthsNonEvenDays() {

        System.out.println("Months with non even number of days: ");

        for (Seasons seas : seasonList) {

            int days = seas.getDays();

            if (days % 2 != 0)

                System.out.println(seas.getMonth());
        }

    }


    static private void monthHasPairNumberDays() {

        boolean find1 = false;

        System.out.println("Введіть місяць. Регістр немає значення");
        String mon = scan.next();

        for (Seasons seas : seasonList) {

            if (seas.getMonth().equalsIgnoreCase(mon)) {

                int days = seas.getDays();

                if (days % 2 == 0) System.out.println("Input month has pair number of days " + seas.getDays());
                else System.out.println("Input month has non pair number of days " + seas.getDays());


                find1 = true;
            }

        }

        if (!find1) {
            System.out.println("Such month does not exists");
        }


    }


}









