package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(20);

        arrayList.add("AAA");
        System.out.println(arrayList.size());

        arrayList.add(1,"EEE");
        System.out.println(arrayList.size());

        System.out.println(arrayList);


    }



}





