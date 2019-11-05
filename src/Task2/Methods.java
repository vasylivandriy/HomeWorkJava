package Task2;

public class Methods {


    public void sum(double a, double b) {
        check( a, b);
        System.out.println(a + b);

    }

    public void sub(double a, double b) {
        check( a, b);
        System.out.println(a - b);

    }

    public void div(double a, double b) {
        check( a, b);
        System.out.println(a / b);

    }

    public void mul(double a, double b) {
        check( a, b);
        System.out.println(a * b);

    }

    private void check(double a, double b) {

        if (a < 0 && b < 0) {
            throw new IllegalArgumentException();
        } else if (a == 0 && b != 0) {
            throw new ArithmeticException();
        } else if (a != 0 && b == 0) throw new ArithmeticException();

        else if (a == 0 && b == 0) {

            try {
                throw new IllegalAccessException("This is error!!!!!!");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                System.out.println(e.getClass());
                System.out.println(e.getMessage());
            }


        } else if (a > 0 && b > 0) {

            try {
                throw new MyException("This is error!!!", a, b);
            } catch (MyException e) {
                e.printStackTrace();
                System.out.println(e.getInputIntA());
                System.out.println(e.getInputIntB());
                System.out.println(e.getMessage());
            }

        }
    }


}
