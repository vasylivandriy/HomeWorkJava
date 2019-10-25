package Task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.util.Arrays.sort;

public class Coin {

    public static void main(String[] args) {

        int n;
        int count_t = 0;
        int count_f = 0;
        boolean a=true;

        Scanner scan = new Scanner(System.in);
        System.out.println("Input how much times to throw a coin");
        n = scan.nextInt();
        Random random = new Random();

if(n==1) {

     boolean i = random.nextBoolean();
    if(i==true)
   System.out.println("Орел");
    else System.out.println("Решка");
}

 else if(n<=0) System.out.println("");

 else {
            boolean[] coinThrow = new boolean[n];

            for (boolean i : coinThrow) {

                i = random.nextBoolean();

                if (i == a) count_t++;
                else count_f++;

                System.out.println(i);
            }



            System.out.println("Орел: "+count_t);
            System.out.println("Решка: "+count_f);

            if (count_t > count_f) System.out.println("Орел");
            else System.out.println("Решка");
        }
    }
}