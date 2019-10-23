package src2;

public class Helm {

    private String color="black";
    private int diametr = 40;
    private int ditance_to_driver = 50;


    public Helm(){}

  public Helm(String color, int diametr, int ditance_to_driver){

      this.color=color;
      this.diametr=diametr;
      this.ditance_to_driver=ditance_to_driver;


  }


    public String getColor() {  return color;}
    public void setColor(String color) {this.color = color;    }

    public int getDiametr() { return diametr; }
    public void setDiametr(int diametr) { this.diametr = diametr; }

    public int getDitance_to_driver() { return ditance_to_driver; }
    public void setDitance_to_driver(int ditance_to_driver) { this.ditance_to_driver = ditance_to_driver; }


    public void helm_diam(int diametr){
        this.diametr+=diametr;   }

    public void helm_ditance_to_driver(int ditance_to_driver){
        this.ditance_to_driver+=ditance_to_driver;}



    @Override
    public String toString() {
        return "Helm{" +
                "color='" + color + '\'' +
                ", diametr=" + diametr +
                ", ditance_to_driver=" + ditance_to_driver +
                '}';
    }
}
