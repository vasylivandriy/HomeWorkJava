package Task4;

public class OverloadMethod {


    int a = 5;
    double b;
    OverloadMethod c;
    double d;
    double cd;

    @Override
    public String toString() {
        return "OverloadMethod{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", cd=" + cd +
                '}';
    }

    public OverloadMethod(int a) {
        this.cd = a;

this.b = a;


    }


    public OverloadMethod(double in) {
        this.d =  in;

    this.c = new OverloadMethod(4);


    }

}
