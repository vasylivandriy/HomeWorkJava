package Task3;

public class MyArrayList {

    private final int START_SIZE = 10;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[START_SIZE];
    private int counter = 0;


    public void add(Object e) {
        if (counter == array.length)
            resize(array.length * 2);

        array[counter++] = e;
    }

    public void remove(int index) {
        for (int i = index; i < counter; i++)
            array[i] = array[i + 1];
        array[counter] = null;
        counter--;
        if (array.length > START_SIZE && counter < array.length / CUT_RATE)
            resize(array.length / 2);

    }

    private void resize(int newLength) {

        Object[] newArray = new Object[newLength];

        System.arraycopy(array, 0, newArray, 0, counter - 1);

        array = newArray;

    }

}