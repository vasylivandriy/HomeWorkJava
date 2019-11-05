package Task2;

public class MyException extends Exception{

private int inputIntA;
private int InputIntB;

    public MyException(String message, int inputIntA, int inputIntB) {
        super(message);
        this.inputIntA = inputIntA;
        InputIntB = inputIntB;
    }

    public int getInputIntA() {
        return inputIntA;
    }

    public int getInputIntB() {
        return InputIntB;
    }
}
