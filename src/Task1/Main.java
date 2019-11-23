package Task1;

import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        System.out.println("With object");
        System.out.println("Class: "+robot.getClass());
        System.out.println("HashCode: "+robot.hashCode());
        System.out.println();


        Class<Robot> robotClass = Robot.class;

        System.out.println("With reference to class");



            System.out.println(1+": full path to class:  " + robotClass.getName());
            System.out.println(2+": full path to class toString :  " + robotClass.toString());
            System.out.println(3+": full path to class:  " + robotClass.getTypeName());
            System.out.println(4+": class name:  " + robotClass.getSimpleName());
            System.out.println(5+": generic super class:  " + robotClass.getGenericSuperclass());
        System.out.println();
            System.out.println(6+": get modifiers for public Robot:  " + robotClass.getModifiers());
            System.out.println(7+": get modifiers for public Robot:  " + Robot.class.getModifiers());
            System.out.println(8+": get modifiers for public abstract Human:  " + Human.class.getModifiers());
        System.out.println();
            System.out.println(9+": get probably all modifiers :  " + Modifier.classModifiers());
            System.out.println(10+": is abstract Human?:  " + Modifier.isAbstract(Human.class.getModifiers()));
            System.out.println(11+": is abstract for Modifier.classModifiers() ?:  " + Modifier.isAbstract(Modifier.classModifiers()));
            System.out.println(12+": is abstract Robot?:  " + Modifier.isAbstract(Robot.class.getModifiers()));
        System.out.println();

            System.out.println(13+": package for Human:  " + Human.class.getPackage());
            System.out.println(14+": packageName for Human:  " + Human.class.getPackageName());
            System.out.println(15+": package for Robot:  " + robotClass.getPackageName());
            System.out.println(16+": superClass for Robot:  " + robotClass.getSuperclass());
            System.out.println(17+": name of superClass:  " + robotClass.getSuperclass().getSimpleName());
            System.out.println(18+": is abstract Robot?:  " + robotClass.getSuperclass().getTypeName());



    }

}
