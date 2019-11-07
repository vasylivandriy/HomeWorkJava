package Task2;

public abstract class Engine {

    private int cylindersNumber;


    public int getCylindersNumber() {
        return cylindersNumber;
    }

    public void setCylindersNumber(int cylindersNumber) {

        if (cylindersNumber >= 2 || cylindersNumber <= 16)
            this.cylindersNumber = cylindersNumber;
        else System.out.println("Wrong number of cylinders");

    }
}
