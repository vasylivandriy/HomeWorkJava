package src2;

public class main {

    public static void main(String[] args) {

        Car car = new Car();
//        Body body = new Body("GREEN", 2000, 2,2);
//        Helm helm = new Helm("yellow", 2, 1);
//        Wheel wheel = new Wheel("purple", 17, 30);

        Body body = new Body();
      Helm helm = new Helm();
        Wheel wheel = new Wheel();


        car.carBody(20);
        car.carHelm("white");
        car.carWheel(25);

        System.out.println(car.toString());
        System.out.println(body.toString());
        System.out.println(helm.toString());
        System.out.println(wheel.toString());


    }
}
