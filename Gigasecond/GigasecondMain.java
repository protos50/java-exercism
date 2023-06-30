package Gigasecond;

import java.time.LocalDate;
import java.time.Month;

public class GigasecondMain {
    public static void main(String[] args) {
        Gigasecond gigasecond1  = new Gigasecond(LocalDate.of(2023, Month.FEBRUARY, 8));
        
        System.out.println(gigasecond1.getDateTime());
    }
}