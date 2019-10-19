public class Circle {

    static float radius;
    static final float pi=3.14159f;
   static float diametr = 2*radius;

//    public Circle(int radius){
//
//        this.radius=radius;
//    }



    public static float circle_square(float diametr){

       float circle_square= (float) (pi*Math.pow(diametr,2)/4);

         return circle_square;
  }

  public static double circle_length (float radius){

      double circle_length=2*pi*radius;

      return circle_length;

  }




}
