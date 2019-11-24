package Task1;


import java.io.Serializable;

public class Robot extends Human implements Serializable {

   public String name = "Robocop";
   private int legs;
    private int hands;
    private Human human;

    public Robot() {
    }

    public Robot(String name, int legs, int hands ) {
        this.name = name;
        this.legs = legs;
        this.hands = hands;

    }


    public Robot(String name, int legs, int hands, Human human) {
        this.name = name;
        this.legs = legs;
        this.hands = hands;
        this.human = human;
    }

    public Robot(int height, int weight, String name, int legs, int hands, Human human) {
        super(height, weight);
        this.name = name;
        this.legs = legs;
        this.hands = hands;
        this.human = human;
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


    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                ", hands=" + hands +
                ", human=" + human +
                '}';
    }

public void myMethod(String a, int[] array){

    System.out.println(a);
    System.out.println();
    for (int arr:array){
        System.out.println(arr);
    }
}

    public void myMethodOther(String[] array1){

        for (String arr1:array1){
            System.out.println(arr1);

    }


    }
}

