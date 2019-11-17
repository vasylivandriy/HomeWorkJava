package Task1;

import java.util.Comparator;

public class NameComparator implements Comparator<Vegetables> {

    @Override
    public int compare(Vegetables o1, Vegetables o2) {

        return o1.getName().compareToIgnoreCase(o2.getName());

    }
}
