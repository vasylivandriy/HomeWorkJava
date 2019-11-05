public class MyException extends Exception {

    private String inputString;

    public MyException(String message, String inputString) {
        super(message);
        this.inputString = inputString;
    }

    public String getInputString() {
        return inputString;
    }
}
