package Task1;

public class Engine {

     int cylindersNumber;


    public Engine(Integer cylindersNumber) {
        this.cylindersNumber = cylindersNumber;
    }

    public int getCylindersNumber() {
        return cylindersNumber;
    }

    public void setCylindersNumber(int cylindersNumber) {

        if (cylindersNumber >= 2 || cylindersNumber <= 16)
            this.cylindersNumber = cylindersNumber;
        else System.out.println("Wrong number of cylinders");

    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylindersNumber=" + cylindersNumber +
                '}';
    }
}
