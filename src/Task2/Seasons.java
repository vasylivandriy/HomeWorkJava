package Task2;

public class Seasons {

private String season;

    public Seasons(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "season='" + season + '\'' +
                '}';
    }
}
