package Task2;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Arrg {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);
        System.out.println(date.toString());
        System.out.println(date.getTime());
        System.out.println(date.getDate());

        Instant instant = date.toInstant();
        System.out.println();
       // System.out.println(instant.atZone((ZoneId) ZoneId.getAvailableZoneIds()).toLocalDate());
        System.out.println(instant.atZone(ZoneId.systemDefault()).toLocalDate());
        System.out.println();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        System.out.println(simpleDateFormat.format(date.getTime()));
        System.out.println();

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        System.out.println(localDate.getChronology());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.atStartOfDay());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getEra());
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.getMonth());



    }
}
