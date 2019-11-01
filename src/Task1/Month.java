package Task1;

public enum Month {

	JANUARY(31),
	FEBRUARY(28),
	MARCH(31),
	APRIL, 
	MAY(31),
	JUNE,
	JULY(31),
	AUGUST(31),
	SEPTEMBER,
	OCTOBER(31),
	NOVEMBER,
	DECEMBER(30);

	private int days;
	private Month season;

	Month(){this.days=30;}

	Month(int days){this.days=days;}

	public int getDays() {
		return days;
	}


	}
