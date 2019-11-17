package Task2;

public class Seasons {

private String season;
private String month;
private Integer days;

    public Seasons(String season, String month, Integer days) {
        this.season = season;
        this.month = month;
        this.days = days;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
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
                ", month='" + month + '\'' +
                ", days=" + days +
                '}';
    }
}
