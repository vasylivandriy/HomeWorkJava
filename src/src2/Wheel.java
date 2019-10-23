package src2;

public class Wheel {

    private String color = "black";
    private int diametr = 19;
    private int width = 20;


    public Wheel(){}


    public Wheel(String color, int diametr, int width){

        this.color=color;
        this.diametr=diametr;
        this.width=width;

    }

    public String getColor() {  return color;}
    public void setColor(String color) {this.color = color;    }

    public int getDiametr() {return diametr; }
    public void setDiametr(int diametr) {this.diametr = diametr; }

    public int getWidth() { return width;}
    public void setWidth(int width) {this.width = width; }


public void wheel_diam(int diametr){
     this.diametr+=diametr;   }

public void wheel_width(int width){
        this.width+=width;}




    @Override
    public String toString() {
        return "Wheel{" +
                "color='" + color + '\'' +
                ", diametr=" + diametr +
                ", width=" + width +
                '}';
    }
}
