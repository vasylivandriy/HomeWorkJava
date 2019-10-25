package Task5;

public class Frog extends Amphibia{

    @Override
    public void eat() {
       // super.eat();
        System.out.println("Тепер я буду їсти і квакати");
    }


    public void sleep() {
        //super.sleep();
        System.out.println("Тепер я буду спати і квакати");
    }


    @Override
    public void swim() {
      //  super.swim();
        System.out.println("Тепер я буду плавати і квакати");

    }

    @Override
    public void walk() {
    //    super.walk();
        System.out.println("Тепер я буду гуляти і квакати");
    }
}
