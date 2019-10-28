package Task2;

public interface Multiply {

    public default double multiple (double a, double b){

        double multipleRez = a*b;
        return multipleRez;
    }

}
