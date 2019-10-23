package src3;

public class MainAnimal {

    public static void main(String[] args) {

Animal animal = new Animal("Crocodile",30,10);
        System.out.println(animal.toString());
        System.out.println("name= "+animal.getName()+" age = "+ animal.getAge()+" speed = "+animal.getSpeed());

        System.out.println("============================================");
animal.setAge(30);
animal.setName("Elephant");
animal.setSpeed(20);

        System.out.println(animal.toString());
    }
}
