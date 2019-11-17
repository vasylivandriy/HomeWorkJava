package Task1;

import java.util.Comparator;
import java.util.Objects;

public class Vegetables implements Comparable<Vegetables> {

    private String name;
    private int price;
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
    public int compareTo(Vegetables o) {
        if (this.getName().compareToIgnoreCase(o.getName())!=0)
            return this.getName().compareToIgnoreCase(o.getName());

        else return this.getColor().compareToIgnoreCase(o.getColor());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetables that = (Vegetables) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(price, that.price) &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, color);
    }
}


