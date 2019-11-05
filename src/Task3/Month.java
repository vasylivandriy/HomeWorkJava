/**
 * Copyright by vasylivandriy
 */

package Task3;

/**
 * @since JDK 1.8
 * @author vasylivandriy
 * @version 1.3
 */

public enum Month {

	JANUARY(31,Seasons.WINTER),
	FEBRUARY(28,Seasons.WINTER),
	MARCH(31, Seasons.SPRING),
	APRIL(30, Seasons.SPRING),
	MAY(31, Seasons.SPRING),
	JUNE(30, Seasons.SUMMER),
	JULY(31, Seasons.SUMMER),
	AUGUST(31, Seasons.SUMMER),
	SEPTEMBER(30, Seasons.AUTUMN),
	OCTOBER(31, Seasons.AUTUMN),
	NOVEMBER(30, Seasons.AUTUMN),
	DECEMBER(31, Seasons.WINTER);


	private int days;
	private Seasons season;

	/**
	 *
	 * @param days amount of days
	 * @param season  season
	 */

	Month(int days, Seasons season){
		this.days=days;
	    this.season=season;
	}

	/**
	 *
	 * @return amount of days
	 */

	public int getDays() {
		return days;
	}

	/**
	 *
	 * @return   season
	 */

    public Seasons getSeason() {
        return season;
    }


}
