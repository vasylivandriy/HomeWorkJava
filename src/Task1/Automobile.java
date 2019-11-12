package Task1;

import java.util.ArrayList;

public class Automobile {

private String name;
private int age;
private int horsePower;
private Engine engine;
private Helm helm;


public Automobile (){}

    public Automobile(int age, int horsePower, String name, Engine engine, Helm helm) {
        this.age = age;
        this.horsePower = horsePower;
        this.name = name;
        this.engine = engine;
        this.helm = helm;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", horsePower=" + horsePower +
                ", engine=" + engine +
                ", helm=" + helm +
                '}';
    }
}
