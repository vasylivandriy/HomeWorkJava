package Task1;

public abstract class Human implements RobotInterface {

    private int height;
    private int weight;

    public Human(){}

    public  Human(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
