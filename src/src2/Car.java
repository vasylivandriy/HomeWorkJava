package src2;

public class Car {

private String color="red";
private String model="BMW";
private int age = 2015;

    public Car() {

    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getModel() {return model;}
    public void setModel(String model) { this.model = model; }

    public int getAge() { return age; }
    public void setAge(int age) {this.age = age;}

//    Body body = new Body("GREEN", 2000, 2,2);
//    Helm helm = new Helm("yellow", 2, 1);
//    Wheel wheel = new Wheel("purple", 17, 30);

    Body body = new Body();
    Helm helm = new Helm();
    Wheel wheel = new Wheel();

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                '}';
    }

    public void carBody(int a){

   //     body.setWidth(body.body_width(a));
    }

    public void carHelm(String color){

        helm.setColor(color);
}

public void carWheel(int diametr){

        wheel.setDiametr(diametr);
}




}
