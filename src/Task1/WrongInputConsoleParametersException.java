package Task1;

import java.io.IOException;

public class WrongInputConsoleParametersException extends IOException {

private String inputString;

    public WrongInputConsoleParametersException(String message, String inputString) {
        super(message);
        this.inputString = inputString;
    }

    public String getInputString() {
        return inputString;
    }



}
