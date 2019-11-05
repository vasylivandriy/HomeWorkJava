import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Input palindrome, please");

        String palindrom = scan.next();

        StringBuffer stringBuffer = new StringBuffer(palindrom);

        StringBuffer reversePalindrom = stringBuffer.reverse();

        if (palindrom.length() != 5) {

            try {
                throw new MyException("Word length not equal 5", palindrom);
            } catch (MyException e) {
                e.printStackTrace();
                System.out.println(e.getInputString());
                System.out.println("Length of input word = " + palindrom.length());
                System.out.println(e.getMessage());
            }
        } else if (!palindrom.equalsIgnoreCase(reversePalindrom.toString())) {

            try {
                throw new MyException("Input word is not palindrome", reversePalindrom.toString());
            } catch (MyException e) {
                e.printStackTrace();
                System.out.println(reversePalindrom.toString());
                System.out.println(e.getMessage());
            }
        } else System.out.println("Word input by user is palindrome and word length = 5.");


    }

}