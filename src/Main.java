public class Main {

    public static void main(String[] args) {


        Integer[] integers = {5, 9, 23, -8, 2, 1, 7, -9,-18,89,65,156,23,45};

        Collection.InnerClass1 innerClass1 = new Collection(integers).new InnerClass1();
        Collection.InnerClass2 innerClass2 = new Collection(integers).new InnerClass2();

        System.out.println("InnerClass2");

        while (innerClass1.hasNext()) {

            System.out.println(innerClass1.next());
        }

        System.out.println("InnerClass2");


        while (innerClass2.hasNext()) {

            System.out.println(innerClass2.next());
        }

    }
}
