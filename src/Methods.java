import java.io.*;

public class Methods {


    public void serialize(Employee employee) throws IOException {

        File file = new File("task1.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(employee);

        fileOutputStream.close();
        objectOutputStream.close();




    }


    public void deSerialize() throws IOException, ClassNotFoundException {

FileInputStream fileInputStream = new FileInputStream("task1.txt");
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

     Employee employee = (Employee) objectInputStream.readObject();

    fileInputStream.close();
    objectInputStream.close();


        System.out.println(employee);

    }


}

