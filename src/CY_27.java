public class CY_27 extends PlaneDrive implements PlanePossibility  {

    String color;
    int maxSpeed;

    public CY_27() { }

    public CY_27(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Plane plane = new Plane() {
        @Override
        void startingEngines() {
            super.startingEngines();
        }

        @Override
        void planeTakeoff() {
            super.planeTakeoff();
        }

        @Override
        void planeLending() {
            super.planeLending();
        }

        @Override
        public String toString() {
            return super.toString();
        }
    };


    @Override
    public void turboAcceleration() {
        System.out.println(String.format("Швидкість літака =  %.2f км/год",(2301+(Math.random()*2000))));
    }

    @Override
    public void technologyStels() {
        System.out.println(String.format("Літака не видно напротязі: %.2f секунди.",(1+(Math.random()*59))));
    }

    @Override
    public void nuclearHit() {
        System.out.println("Кількість ядерних боєголовок: " + (1+(int)(Math.random()*9)));
    }



    @Override
    public String toString() {
        return "CY_27{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }




}
