

public class Main {

    public static void main(String[] args) {

//===========================================КОЛО===================================================

        System.out.println("Площа кола дорівнює "+Math.round(Circle.circle_square(5)*100)/100d); //заокруглюємо до 2-го знака після коми
        System.out.println("Довжина кола дорівнює "+Math.round(Circle.circle_length(25)*100)/100d);//заокруглюємо до 2-го знака після коми

        System.out.println("=======================================================================================");
//======================================ПРЯМОКУТНИК================================================================//

  //для конструктора без параметрів
        rectangle rec1 = new rectangle();

        System.out.println("конструктор без параметрів");
        System.out.println("Довжина = "+ rec1.getA_length()+"\nwidth = "+ rec1.getB_width());
        System.out.println("Площа прямокутника = "+ rectangle.rec_square(rec1.getA_length(),rec1.getB_width()));
        System.out.println("Периметр прямокутника = "+rectangle.rec_perymeter(rec1.getA_length(),rec1.getB_width()));
        System.out.println();
        System.out.println();


        //для конструктора з двома параметрами
        rectangle rec2 = new rectangle(2,3);

        System.out.println("конструктор з двома параметрами");
        System.out.println("початкові значення довжини = "+ rec2.getA_length()+ " і ширини = "+rec2.getB_width());

        rec2.setA_length(20);
        rec2.setB_width(-20);
        System.out.println("змінені значення довжини = "+ rec2.getA_length()+ " і ширини = "+rec2.getB_width());

        System.out.println("Площа прямокутника = "+ rectangle.rec_square(rec2.getA_length(),rec2.getB_width()));
        System.out.println("Периметр прямокутника = "+rectangle.rec_perymeter(rec2.getA_length(),rec2.getB_width()));
        System.out.println();
        System.out.println();


//         для конструктора з одним параметром
        System.out.println("конструктор з одним параметром");


        rectangle rec3 = new rectangle();


        System.out.println("довжина = "+ rec3.getA_length()+ " і ширина = "+rec3.getB_width());


        System.out.println("Площа прямокутника = "+ rectangle.rec_square(rec3.getA_length(),rec3.getB_width()));
        System.out.println("Периметр прямокутника = "+rectangle.rec_perymeter(rec3.getA_length(),rec3.getB_width()));
        System.out.println();
        System.out.println();

    }
}
