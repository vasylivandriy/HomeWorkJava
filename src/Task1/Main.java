package Task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        System.out.println("With object");
        System.out.println("Class: " + robot.getClass());
        System.out.println("HashCode: " + robot.hashCode());
        System.out.println();


        Class<Robot> robotClass = Robot.class;

        System.out.println("With reference to class");


        System.out.println(1 + ": full path to class:  " + robotClass.getName());
        System.out.println(2 + ": full path to class toString :  " + robotClass.toString());
        System.out.println(3 + ": full path to class:  " + robotClass.getTypeName());
        System.out.println(4 + ": class name:  " + robotClass.getSimpleName());
        System.out.println(5 + ": generic super class:  " + robotClass.getGenericSuperclass());
        System.out.println();
        System.out.println(6 + ": get modifiers for public Robot:  " + robotClass.getModifiers());
        System.out.println(7 + ": get modifiers for public Robot:  " + Robot.class.getModifiers());
        System.out.println(8 + ": get modifiers for public abstract Human:  " + Human.class.getModifiers());
        System.out.println();
        System.out.println(9 + ": get probably all modifiers :  " + Modifier.classModifiers());
        System.out.println(10 + ": is abstract Human?:  " + Modifier.isAbstract(Human.class.getModifiers()));
        System.out.println(11 + ": is abstract for Modifier.classModifiers() ?:  " + Modifier.isAbstract(Modifier.classModifiers()));
        System.out.println(12 + ": is abstract Robot?:  " + Modifier.isAbstract(Robot.class.getModifiers()));
        System.out.println();

        System.out.println(13 + ": package for Human:  " + Human.class.getPackage());
        System.out.println(14 + ": packageName for Human:  " + Human.class.getPackageName());
        System.out.println(15 + ": package for Robot:  " + robotClass.getPackageName());
        System.out.println(16 + ": superClass for Robot:  " + robotClass.getSuperclass());
        System.out.println(17 + ": name of superClass:  " + robotClass.getSuperclass().getSimpleName());
        System.out.println(18 + ": typeName of superClass:  " + robotClass.getSuperclass().getTypeName());
        System.out.println();


        Class<?>[] interfaces = robotClass.getInterfaces();

        for (Class inter : interfaces) {

            System.out.println(19 + ": interfaces:  " + inter);
        }


        Class<?>[] interfacesSuper = robotClass.getSuperclass().getInterfaces();

        for (Class inter1 : interfacesSuper) {

            System.out.println(20 + ": interfacesSuper:  " + inter1);
        }

        System.out.println();

        Constructor<?>[] constructors = robotClass.getConstructors();

        for (Constructor constr : constructors) {

            System.out.println(21 + ": constructors:  " + constr);
        }


        Constructor<?>[] constructorsSuper = robotClass.getSuperclass().getConstructors();

        for (Constructor constr1 : constructorsSuper) {

            System.out.println(22 + ": constructorsSuper:  " + constr1);
        }

        System.out.println();


    Constructor<?> constructor = constructors[0];
    Class<?>[] getParam = constructor.getParameterTypes();

    for(Class param: getParam){
        System.out.println( param);
    }



    }

}
