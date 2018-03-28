package main.java.com.ziemo.qStore.helper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConverter {

    public static LocalDate stringToLocalDate(String txt) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(txt, formatter);
    }



}
