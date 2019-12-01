package Task1;

import java.util.Scanner;

public class MyThread extends Thread {

    @Override
    public  void run() {

        System.out.println("Input amount numbers Fibonachi");

        Scanner scanner = new Scanner(System.in);

        int numb = scanner.nextInt();

        int[] fibs = new int[numb];
        System.out.print("Потік Thread :");

        for (int i = 0; i < numb; i++) {

            if (i == 0) {
                fibs[i] = 1;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(" " + fibs[i]);
            } else if (i == 1) {
                fibs[i] = 1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(" " + fibs[i]);
            } else {
                fibs[i] = fibs[i - 1] + fibs[i - 2];
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(" " + fibs[i]);

            }
        }
    }

}


class MyThreadRunnable implements Runnable {

    @Override
    public  void run() {
        System.out.println();
        System.out.println("Input amount numbers Fibonachi");

        Scanner scanner = new Scanner(System.in);

        int numbrev = scanner.nextInt();

        int[] fibs = new int[numbrev];

        System.out.print("Потік Runnable : ");

        for (int i = 0; i < numbrev; i++) {
            if (i == 0) {
                fibs[i] = 1;

            } else if (i == 1) {
                fibs[i] = 1;

            } else {
                fibs[i] = fibs[i - 1] + fibs[i - 2];
            }
        }

        for (int i = numbrev - 1; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(" " + fibs[i]);
        }


    }
}