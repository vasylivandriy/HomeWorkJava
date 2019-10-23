package src1;

public class main {


    public static void main(String[] args) {

        Robot robot = new Robot();

        CoockerRobot coock = new CoockerRobot();
        coock.work();

        CoffeeRobot coffee = new CoffeeRobot();
        coffee.work();

        RobotDancer dance = new RobotDancer();
        dance.work();
        System.out.println("=========================================================================");
/////////////////////////////////////////////////////////////////////////

       Robot[] array =  {robot, coock, coffee, dance};

        for(Robot i: array){

            Robot n =i.work();

            System.out.println(i);  //адреса коміркив пам'яті де збеігається конкретний об'єкт
            System.out.println(array); //адреса блока в пам'яті, де зберігаюється даний масив об'єктів
            System.out.println("=============");}

    }
}
