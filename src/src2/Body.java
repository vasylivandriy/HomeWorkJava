package src2;

public class Body {



    private String color;
   private int weight ;
   private int length ;
   private int width ;

public Body(){}

public Body(String color, int weight, int length, int width){

       this.color=color;
       this.weight=weight;
       this.length=length;
       this.width=width;
       }

    public String getColor() {  return color;}
    public void setColor(String color) {this.color = color;    }

    public int getLength() { return length; }
    public void setLength(int length) {this.length = length; }

    public int getWeight() { return weight;}
    public void setWeight(int weight) { this.weight = weight; }

    public int getWidth() { return width;}
    public void setWidth(int width) {this.width = width; }


    public void body_width(int width){
        this.width+=width;}

    public void body_length(int length){
        this.length+=length;}


    @Override
    public String toString() {
        return "Body{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
