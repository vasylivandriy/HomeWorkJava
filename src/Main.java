import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {


        Collection.InnerClass1 innerClass1 = new Collection(new Number[]{5, 9, 23, -8, 2, 1, 7, -9,-18,89,65,156,23,45}).new InnerClass1();
        Collection.InnerClass2 innerClass2 = new Collection(new Number[]{5, 9, 23, -8, 2, 1, 7, -9,-18,89,65,156,23,45}).new InnerClass2();

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

        Collection collection = new Collection(new Number[]{5, 9, 23, -8, 2, 1, 7, -9,-18,89,65,156,23,45,0});

        Object local = collection.task4Local();

        while (((IteratorExample) local).hasNext()){

            System.out.println(((IteratorExample) local).next());
        }
/////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Static class");

        Collection collection1 = new Collection(new Number[]{5, 10, 23, -8, 2, 1, 7, 0,-18,89,65,166,23,50,0});

          Collection.StaticClass staticClass = new Collection.StaticClass();

        while (staticClass.hasNext()){

            System.out.println(staticClass.next());
        }

////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Anonimus class");



        Collection collection2 = new Collection(new Number[]{5, 11, 23, -8, 2, 1, 7, 1,-18,89,65,166,23,50,0,9,13,58,1});

    //    IteratorExample iteratorExampleAnonimus  = collection2.iteratorExampleAnonimus;

        IteratorExample iteratorExampleAnonimus = new IteratorExample() {

   private int index5 = Collection.numbers.length;

    @Override
    public Object next() {

        index5 -= 3;

        if (index5>=0&&((Integer) Collection.numbers[index5]) %2!= 0)

            return Collection.numbers[index5];

        else return " ";

    }

    @Override
    public boolean hasNext() {
        return index5>=0;
    }
};



        while (iteratorExampleAnonimus.hasNext()){
            System.out.println(iteratorExampleAnonimus.next());
        }

    }

}
