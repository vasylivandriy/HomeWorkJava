package Task1;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();

        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
        Thread thread = new Thread(myThreadRunnable);


        myThread.start();
        myThread.join();

        thread.start();




    }
}
