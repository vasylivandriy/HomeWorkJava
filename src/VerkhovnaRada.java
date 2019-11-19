import java.util.Scanner;

public class VerkhovnaRada extends Faction {

     Scanner scan = new Scanner(System.in);
 Faction faction = new Faction();

    public static void main(String[] args) {

    }

    public void addFaction() {

        System.out.println("Input name of faction");
        String line = scan.nextLine();



     //   for (String fact : factionsList) {
            System.out.println(factionsList);
     //   }

    }

    public void removeFaction() {

        System.out.println("Input name of faction");
        String line = scan.nextLine();

        factionsList.add(line);

        for (String fact : factionsList) {
            factionsList.remove(fact);
        }

        for (String fact : factionsList) {
            System.out.println(fact);
        }

    }

    public void printAllFaction() {
    }

    public void cleanFaction() {
    }

    public void printFaction() {
    }

    public void addDelegateFaction() {
    }

    public void deleteDelegateFaction() {
    }

    public void printListBribers() {
    }

    public void printMostBriber() {
    }


}
