import java.util.Arrays;

public class Collection {

    public static Number[] numbers;


    public Collection(Number[] numbers) {
        this.numbers = numbers;
    }

//    public Collection() {
//
//    }

/////////////////////////////////////////////////////////////////////////////

    public class InnerClass1 implements IteratorExample {


        private int index1 = -1;


        @Override
        public Object next() {

            index1 += 1;
            if (index1 % 2 == 0) {

                return numbers[index1];
            } else return numbers[index1] = 0;
        }

        @Override
        public boolean hasNext() {

            return index1 < numbers.length - 1;
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
            else return "Кінець";


        }

        @Override
        public boolean hasNext() {

            return index2 >= 0;


        }


    }


//////////////////////////////////////////////////////////////////////////////////////

    public IteratorExample task4Local() {

        class LocalClass implements IteratorExample {


            private int index3 = -1;

            @Override
            public Object next() {

                index3 += 1;

                if ((index3 + 1) % 5 == 0 && index3 % 2 == 0) {


                    numbers[index3] = (Integer) numbers[index3] - 100;

                    return numbers[index3];
                } else return numbers[index3];
            }

            @Override
            public boolean hasNext() {

                return index3 < numbers.length - 1;
            }

        }


        LocalClass localClass = new LocalClass();

        return localClass;


    }

    static class StaticClass implements IteratorExample {

        private int index4 = -1;

        @Override
        public Object next() {

            index4+=2;
            if ((index4 < numbers.length - 1)&&(Integer) numbers[index4] % 2 == 0) {

               numbers[index4] = (Integer) numbers[index4] + 1;

                return numbers[index4];
            }
            else return null;

        }

        @Override
        public boolean hasNext() {
            return index4 < numbers.length - 1;
        }
    }


// IteratorExample iteratorExampleAnonimus = new IteratorExample() {
//
//
//   private int index5 = numbers.length;
//    @Override
//    public Object next() {
//
//        index5 -= 3;
//
//        if (index5>=0&&((Integer) numbers[index5]) %2!= 0)
//
//            return numbers[index5];
//
//        else return " ";
//
//    }
//
//    @Override
//    public boolean hasNext() {
//        return index5>=0;
//    }
//};

}

