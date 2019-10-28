package Task2;

public interface Devide {


    public default double devide (double a, double b){

if(b==0) {  System.out.println("Ділити на '0' не можна"); return 0; }
    else {
    double devideRez = a / b;
    return devideRez;  }
    }

}
