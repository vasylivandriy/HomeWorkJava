public abstract class Plane {

   double planeLength =21.96;
   double planeWidth=33.5;
   double planeWeight=30000;

   public Plane(){};



    void startingEngines(){
        System.out.println(String.format("Час, який залишився до готовності злетіти: %.2f секунд.",(20+(Math.random()*68))));

    }


    void planeTakeoff(){
        System.out.println(String.format("На повному баку палива літак пролетить: %.2f км.",((Math.random()*1000))));

    }


    void planeLending()  {
        System.out.println("Тримайтеся!!! Літак сідає!!!");    }

    @Override
    public String toString() {
        return "Plane{" +
                "planeLength=" + planeLength +
                ", planeWidth=" + planeWidth +
                ", planeWeight=" + planeWeight +
                '}';
    }
}
