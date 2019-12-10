package Task2;

import java.io.FileNotFoundException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Formatter;

public class TaskTime {

    public static void main(String[] args) throws FileNotFoundException, ParseException {


convertDateToLocalDate(1864364668765L, "02.10.2018");
       convertDateToLocalTime(1864364668765L);
convertDateToLocalDateTime(1864364668765L);


    }

    private static void convertDateToLocalDate(Long milisec, String inputDate) throws FileNotFoundException, ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(simpleDateFormat.parse(inputDate));

        Date date = new Date(milisec);
        Date date1 = simpleDateFormat.parse(inputDate);

        System.out.println("Date before changing: " + date + " - " + date.getTime()+" milisec.");



        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        System.out.println("LocalDate after changing date: " + localDate);
        System.out.println("LocalDate after changing date: " + localDate1);
        System.out.println();
    }

    private static void convertDateToLocalTime(Long milisec) {

        Date date = new Date(milisec);
        System.out.println("Date before changing: " + date);
        System.out.println("Time before changing: " + date.getTime()+" milisec.");

        LocalTime localTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        System.out.println("LocalTime after changing date: " + localTime);

        System.out.println();
    }

    private static void convertDateToLocalDateTime(Long milisec) {

        Date date = new Date(milisec);

        System.out.println("Date before changing: " + date);

        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime localDateTime1 = Instant.ofEpochMilli(milisec).atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("LocalDateTime after changing date: " + localDateTime);
        System.out.println("LocalDateTime after changing date (another method): " + localDateTime1);


        System.out.println();


    }


}
