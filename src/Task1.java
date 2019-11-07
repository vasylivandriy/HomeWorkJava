import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Task1 {

    public static void main(String[] args) {

Integer [] array = new Integer[30];

        for (int i = 0; i < array.length; i++) {

            array[i]=  (Integer)((int)(Math.random()*10));

        }

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println(Arrays.toString(array));


    }
}
