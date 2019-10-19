public class Main {

    public static void main(String[] args) {



        System.out.println("Площа кола дорівнює "+Math.round(Circle.circle_square(5)*100)/100d); //заокруглюємо до 2-го знака після коми
        System.out.println("Довжина кола дорівнює "+Math.round(Circle.circle_length(25)*100)/100d);//заокруглюємо до 2-го знака після коми

        System.out.println("=======================================================================================");
//======================================================================================================//
    //    rectangle rec2 = new rectangle(5,3);

        System.out.println("Площа прямокутника = "+rectangle.rec_square(rectangle.a_length, rectangle.b_width));
        System.out.println("Периметр прямокутника = "+rectangle.rec_perymeter(3,3));


        rectangle rec1 = new rectangle();
  //      rectangle rec2 = new rectangle(2,3);
        rectangle rec3 = new rectangle(1);




    }
}
