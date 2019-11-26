import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {


        Collection.InnerClass1 innerClass1 = new Collection(new Object[]{5, 9, 23, -8, 2, 1, 7, -9,-18,89,65,156,23,45}).new InnerClass1();
        Collection.InnerClass2 innerClass2 = new Collection(new Object[]{5, 9, 23, -8, 2, 1, 7, -9,-18,89,65,156,23,45}).new InnerClass2();

        System.out.println("InnerClass1");

        while (innerClass1.hasNext()) {

            System.out.println(innerClass1.next());
        }

        System.out.println();

        System.out.println("InnerClass2");

        while (innerClass2.hasNext()) {

            System.out.println(innerClass2.next());
        }

        System.out.println();
///////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Local class");

        Collection collection = new Collection(new Object[]{5, 9, 23, -8, 2, 1, 7, -9,-18,89,65,156,23,45,0});

        Object local = collection.task4Local();

        while (((IteratorExample) local).hasNext()){

            System.out.println(((IteratorExample) local).next());
        }
/////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Static class");

        Collection collection1 = new Collection(new Object[]{5, 10, 23, -8, 2, 1, 7, 0,-18,89,65,166,23,50,0});

          Collection.StaticClass staticClass = new Collection.StaticClass();

        while (staticClass.hasNext()){

            System.out.println(staticClass.next());
        }

////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Anonimus class");

        IteratorExample iteratorAnonimus  = new Collection(new Object[]{5, 9, 23, -8, 2, 1, 7, -9,-18,89,65,156,23,45,0}).iteratorExampleAnonimus;

while (iteratorAnonimus.hasNext()){
    System.out.println(iteratorAnonimus.next());
}

    }

}
