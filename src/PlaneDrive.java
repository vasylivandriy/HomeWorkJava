public class PlaneDrive extends Plane{


    private double distanceUP;
    private double distanceDown;
    private double distanceBack;
    private double distanceForward;



    public double getDistanceUP() {
        return distanceUP;    }

    public void setDistanceUP(double distanceUP) {
        if(distanceUP<0) System.out.println("Відстань має бути в не менша від '0'");
        else  this.distanceUP = distanceUP;    }


    public double getDistanceDown() {
        return distanceDown;    }

    public void setDistanceDown(double distanceDown) {
        if(distanceDown<0) System.out.println("Відстань має бути в не менша від '0'");
        else  this.distanceDown = distanceDown;    }


    public double getDistanceBack() {
        return distanceBack;    }

    public void setDistanceBack(double distanceBack) {
        if(distanceBack<0) System.out.println("Відстань має бути в не менша від '0'");

        else  this.distanceBack = distanceBack;   }


    public double getDistanceForward() {
        return distanceForward;    }

    public void setDistanceForward(double distanceForward) {
        if(distanceForward<0) System.out.println("Відстань має бути в не менша від '0'");
        else     this.distanceForward = distanceForward;
    }

    public void moveUp(){


       setDistanceUP(Math.random()*1000);
 System.out.println(String.format("Distance move up = %.2f км. ", getDistanceUP()));
    }

    public void moveDown(){
        setDistanceDown(Math.random()*1000);
        System.out.println(String.format("Distance move down = %.2f км. ", getDistanceDown()));
    }

    public void moveBack(){
        setDistanceBack(Math.random()*1000);
        System.out.println(String.format("Distance move back = %.2f км. ", getDistanceBack()));
    }

    public void moveForward(){
        setDistanceForward(Math.random()*1000);
        System.out.println(String.format("Distance move forward = %.2f км. ", getDistanceForward()));
    }


}
