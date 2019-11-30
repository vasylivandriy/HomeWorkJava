import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MethodsTask3 {


    public void serializeTask3(List employe) throws IOException {

        File file = new File("task2.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(employe);

        fileOutputStream.close();
        objectOutputStream.close();




    }


    public void deSerializeTask3() throws IOException, ClassNotFoundException {

FileInputStream fileInputStream = new FileInputStream("task2.txt");
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

       List employe = (List) objectInputStream.readObject();

    fileInputStream.close();
    objectInputStream.close();


        System.out.println(employe);

    }


}

