package Task2;

public class MyException extends Exception{

private double inputIntA;
private double InputIntB;

    public MyException(String message, double inputIntA, double inputIntB) {
        super(message);
        this.inputIntA = inputIntA;
        InputIntB = inputIntB;
    }

    public double getInputIntA() {
        return inputIntA;
    }

    public double getInputIntB() {
        return InputIntB;
    }
}
