package Task2;

public class Month {

	private int days;
	private String month;

    public Month(int days, String month) {
        this.days = days;
        this.month = month;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Month{" +
                "days=" + days +
                ", month='" + month + '\'' +
                '}';
    }
}
