package Task2;

import java.util.Scanner;

public class MainCommodity {

    static Scanner scan = new Scanner(System.in);

    static Commodity commodity = new Commodity();

    public static void main(String[] args) {

        menuShow();
        System.out.println("Input number");
        String line = scan.next();

        while (line.equalsIgnoreCase("quit")) {

            switch (line) {
                case "1":
                    commodity.addGoods();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
//                    commodity.quitProgram();
                    break;


            }

        }


    }

    private static void menuShow() {

        System.out.println(
                "1. Додати товар" +
                        "2. видалити товар" +
                        "3. Замінити товар" +
                        "4. Сортувати за назвою" +
                        "5. Сортувати за довжиною" +
                        "6. Сортувати за шириною" +
                        "7. Сортувати за вагою" +
                        "8. Вивести і-й елемент колекції" +
                        "9. Вийти з програми");

    }
}
