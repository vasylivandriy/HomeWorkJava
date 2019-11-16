package Task2;

import java.util.*;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Seasons> seasonList = new ArrayList<>();

    public static void main(String[] args) {


//        Enumeration<String> Month1, Season1;
//
//        Vector<String> seasons12 = new Vector<>();
//        Vector<String> month12 = new Vector<>();
//
//        seasons12.add("Winter");
//        seasons12.add("Spring");
//        seasons12.add("Summer");
//        seasons12.add("Autumn");
//
//        month12.add("JANUARY");
//        month12.add("FEBRUARY");
//        month12.add("MARCH");
//        month12.add("APRIL");
//        month12.add("MAY");
//        month12.add("JUNE");
//        month12.add("JULY");
//        month12.add("AUGUST");
//        month12.add("SEPTEMBER");
//        month12.add("OCTOBER");
//        month12.add("NOVEMBER");
//        month12.add("DECEMBER");
//
//
//        Season1 = seasons12.elements();
//        Month1 = month12.elements();

//
//        String[] seasons = {"Winter","Spring","Summer","Autumn"};
//
//        String[] month = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
//        Integer[] days = {31,28,31,30,31,30,31,31,30,31,30,31};


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

                Seasons place = seasonList.get(seas)

                if (place == 0) System.out.println(Seasons.values()[place + Seasons.values().length - 1]);
                else System.out.println(Seasons.values()[place - 1]);

                find = true;
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









