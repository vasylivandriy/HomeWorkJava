import java.util.Arrays;

public class Collection {

    public Object[] numbers;


    public Collection(Object[] numbers) {
        this.numbers = numbers;
    }

/////////////////////////////////////////////////////////////////////////////

    public class InnerClass1 implements IteratorExample {


       private int index1 = -1;


        @Override
        public Object next() {

            index1+=1;
            if (index1%2==0) {

                return numbers[index1];
            }
        else return numbers[index1]=0;
        }

        @Override
        public boolean hasNext() {

            return index1 < numbers.length-1;
        }


      }


    ////////////////////////////////////////////////////////////////////


    public class InnerClass2 implements IteratorExample {
        int index2 = numbers.length - 1 + 2;

        @Override
        public Object next() {

            index2 -= 2;
            if (index2 >= 0)
                return numbers[index2];
            else return null;

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
