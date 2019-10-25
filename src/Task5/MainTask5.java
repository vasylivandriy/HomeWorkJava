package Task5;

public class MainTask5 {

    public static void main(String[] args) {

        Frog frogfrog = new Frog();
        Amphibia amphibia1 = new Amphibia();
        Crocodile crocodile = new Crocodile();



        frogfrog.eat();
        frogfrog.sleep();
        frogfrog.swim();
        frogfrog.walk();
        System.out.println("==================================================");
////////////////////////////////////////////////////////////////////////

         Amphibia crocodile1 =  new Crocodile();

         
         crocodile1.sleep();

         Amphibia frog1 = new Frog();

         frog1.sleep();

        ((Frog)frog1).sleep();

 ///////////////////////////////////////////////////////////////////////////////
    }
}
