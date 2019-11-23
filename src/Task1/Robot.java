package Task1;


import java.io.Serializable;

public class Robot extends Human implements Serializable {

    private String name = "Robocop";
    private int legs = 2;
    private int hands = 2;

    public Robot(){}

    public Robot(String name, int legs, int hands) {
        this.name = name;
        this.legs = legs;
        this.hands = hands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getHands() {
        return hands;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }
}

