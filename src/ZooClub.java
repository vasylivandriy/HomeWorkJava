import java.util.Scanner;

public class ZooClub {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        showMenu();
        System.out.println("Input number of action");
        int line = scan.nextInt();

        switch (line){

            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;


        }


    }

public static void showMenu(){

    System.out.println("1. Додати учасника клубу");
    System.out.println("2. Додати тварину до учасника клубу");
    System.out.println("3. Видалити тварину з учасника клубу");
    System.out.println("4. Видалити учасника клубу");
    System.out.println("5. Видалити конкреткну тварину зі всіх власників");
    System.out.println("6. Вивести на екран зооклуб");
    System.out.println("7. Вийти з програми");

}

}
