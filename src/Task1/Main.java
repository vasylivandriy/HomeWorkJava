package Task1;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

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


        Constructor<?> constructorSuper = constructorsSuper[0];
        Class<?>[] getParamSuper = constructorSuper.getParameterTypes();

        for (Class paramSuper : getParamSuper) {
            System.out.println(23 + ": for constructorsSuper (Human) get parameterTypes:  " + paramSuper);
        }
        System.out.println();

        Constructor<?> constructor = constructors[0];
        Class<?>[] parameterTypes = constructor.getParameterTypes();

        for (Class param : parameterTypes) {
            System.out.println(23.1 + ": for constructors (Robot) get parameterTypes:  " + param);
        }

        System.out.println();

        Constructor<Robot> constructor1 = robotClass.getConstructor(String.class, int.class, int.class, Human.class);

        System.out.println(24 + ": constructor class Robot:  " + constructor1);
        System.out.println();

/////////////////////////////////////////TASK 2///////////////////////////////////////////////////////////////////////////////////////////////
        Robot robot1 = robotClass.getDeclaredConstructor(String.class, int.class, int.class).newInstance("Afera", 12, 13);

        System.out.println(25 + " constructor with input parameters: " + robot1);

        Robot robot2 = robotClass.getDeclaredConstructor(String.class, int.class, int.class, Human.class).newInstance("Afera", 12, 13, new Human(23, 23) {
            @Override
            public void setHeight(int height) {
                super.setHeight(height);
            }

            @Override
            public void setWeight(int weight) {
                super.setWeight(weight);
            }
        });

        System.out.println(26 + " constructor with input parameters: " + robot2);

        Robot robot3 = robotClass.getDeclaredConstructor().newInstance();
        System.out.println(27 + " constructor with current parameters: " + robot3);

        System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Field[] fields = robotClass.getFields();

        for (Field field : fields) {

            System.out.println(28 + " public fields: " + field);
        }

        Field[] declaredFields = robotClass.getDeclaredFields();

        for (Field fieldDec : declaredFields) {

            System.out.println(29 + " all fields:  " + fieldDec);
        }

        System.out.println();



Method[] robotClassDeclaredMethods = robotClass.getDeclaredMethods();
for (Method method:robotClassDeclaredMethods){
    System.out.println(30+" DeclaredMethods:  "+method);}
        System.out.println();

    Method[] robotClassMethods = robotClass.getMethods();
    for (Method method1:robotClassMethods){

        System.out.println(31+" Methods:  "+method1);

}
     System.out.println();


 ////////////////////TASK 3///////////////////////////////////////////////////////////////////////////////////////

        System.out.println(robotClassMethods[4]);


        robotClassMethods[4].invoke(robot, "Aladdin",new int[]{2,3,5});
        System.out.println();

        System.out.println(robotClassMethods[5]);


        robotClassMethods[5].invoke(robot, new Object[]{new String[]{"a", "b", "c", "d", "e"}});


    }


}
