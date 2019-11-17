package Task1;

import java.util.Comparator;


public class AllComparator implements Comparator<Vegetables> {


    @Override
    public int compare(Vegetables o1, Vegetables o2) {

        if (o1.getName().compareToIgnoreCase(o2.getName())!=0)
        return o1.getName().compareToIgnoreCase(o2.getName());

        else if (o1.getPrice().compareTo(o2.getPrice())!=0)
            return o1.getPrice().compareTo(o2.getPrice());

            else return o1.getColor().compareToIgnoreCase(o2.getColor());
    }
}
