import java.util.Random;
import java.util.Scanner;

public class Delegate  {


    private String surname;
    private String name;
    private Integer age;
    private boolean bribeTaker;
    private Integer bribeSize;
    private String faction;
    private Human human;


    public Delegate(){}

    public Delegate(String surname, String name, Integer age, boolean bribeTaker, String faction, Human human) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.bribeTaker = bribeTaker;
        this.faction = faction;
        this.human = human;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribeTaker() {
        return bribeTaker;
    }

    public void setBribeTaker(boolean bribeTaker) {
        this.bribeTaker = bribeTaker;
    }

    public int getBribeSize() {
        return bribeSize;
    }

    public void setBribeSize(int bribeSize) {
        this.bribeSize = bribeSize;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    Scanner scan = new Scanner(System.in);


    public void bribeGive(Boolean bribeTaker) {

        if (!bribeTaker) {
            System.out.println("Цей депутат не бере хабарів");

        } else {
            System.out.println("Введіть суму хабаря, яку ви даєте");
            int bribeSize12 = scan.nextInt();

            if (bribeSize12 > 5000) {
                System.out.println("Police arrest a delegate");

            } else {
               setBribeSize(bribeSize12);

            }
        }
    }


    @Override
    public String toString() {
        return "Delegate{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bribeTaker=" + bribeTaker +
                ", bribeSize=" + bribeSize +
                ", faction=" + faction +
                ", human=" + human +
                '}';
    }
}

