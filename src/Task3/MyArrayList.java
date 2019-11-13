package Task3;

public class MyArrayList<T> {

    private final int START_SIZE = 10;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[START_SIZE];
    private int counter = 0;


    public void add(String element) {


        public void add (T, Object){
            if (counter == array.length - 1)
                resize(array.length * 2); // увеличу в 2 раза, если достигли границ
            array[counter++] =Object;
        }


        private Object resize ( int newSize){

            Object[] newArray = new Object[newSize];

            System.arraycopy(array, 0, newArray, 0, counter);

            return;
            newArray[];

        }


    }
}