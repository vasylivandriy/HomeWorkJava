package Task1;

public class Vegetables implements Comparable<Vegetables>{

    private String name;
    private Integer price;
    private  String color;

    public Vegetables(String name, Integer price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vegetables vegetable) {

        if (this.getName().equalsIgnoreCase(vegetable.getName()))
        return 0;

     else return 1;
    }
}


