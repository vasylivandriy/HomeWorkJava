import java.util.Arrays;

public class Collection {

    public Object[] numbers;


    public Collection(Object[] numbers) {
        this.numbers = numbers;
    }

/////////////////////////////////////////////////////////////////////////////

//    public class InnerClass1 implements IteratorExample {
//
//
//       private int index1 = 0;
//        private Object[] myArray1;

//        @Override
//        public Object next() {

//            for (Object i =0;i<numbers.length;i++) {
//          if (numbers[i]%2!=0){
//
//              numbers[i]=0;
//          }

//                     }
//
//            return myArray1[index1++];
//        }
//
//        @Override
//        public boolean hasNext() {
//
//            return index1 < myArray1.length-1;
//        }


    //  }


    ////////////////////////////////////////////////////////////////////


    public class InnerClass2 implements IteratorExample {
        int index2 = numbers.length - 1 + 2;

        @Override
        public Object next() {

            index2 -= 2;
            if (index2 >= 0)
                return numbers[index2];
            else return "The end of array";

        }

        @Override
        public boolean hasNext() {

            return index2 >= 0;


        }


    }


    @Override
    public String toString() {
        return "Collection{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

//////////////////////////////////////////////////////////////////////////////////////


}
