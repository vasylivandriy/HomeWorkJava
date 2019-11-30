import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

Methods methods = new Methods();


methods.serialize(new Employee("Андрій",((int)(Math.random()*51)+1000),5000));

methods.deSerialize();

        List<Employee> objectList = new ArrayList<>();

        objectList.add(new Employee("Тарас",(int)(Math.random()*1001),((int)(Math.random()*9001))+15000));
        objectList.add(new Employee("Володимир",(int)(Math.random()*1001),((int)(Math.random()*9001))+15000));
        objectList.add(new Employee("Олег",(int)(Math.random()*1001),((int)(Math.random()*9001))+15000));
        objectList.add(new Employee("Анрій",(int)(Math.random()*1001),((int)(Math.random()*9001))+15000));
        objectList.add(new Employee("Петро",(int)(Math.random()*1001),((int)(Math.random()*9001))+15000));
        objectList.add(new Employee("Павло",(int)(Math.random()*1001),((int)(Math.random()*9001))+15000));
        objectList.add(new Employee("Панас",(int)(Math.random()*1001),((int)(Math.random()*9001))+15000));


        MethodsTask3 methodsTask3 = new MethodsTask3();

        methodsTask3.serializeTask3(objectList);
        methodsTask3.deSerializeTask3();

    }
}
