import java.util.Scanner;

public class Delegate extends Human {


    private String surname;
    private String name;
    private int age;
    private boolean bribeTaker;
    private int bribeSize;
    private Human human;

    public Delegate(String surname, String name, int age, boolean bribeTaker, Human human) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.bribeTaker = bribeTaker;
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

    Scanner scan = new Scanner(System.in);

    private int bribeGive() {

        if (!bribeTaker) {
            System.out.println("Цей депутат не бере хабарів");
            return 0;
        } else {

            System.out.println("Введіть суму хабаря, яку ви даєте");
            int bribeSize12 = scan.nextInt();

            if (bribeSize > 5000) {
                System.out.println("Police arrest a delegate");
                return 0;
            } else {
                bribeSize = bribeSize12;
                return bribeSize;
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
                ", human=" + human +
                '}';
    }
}
