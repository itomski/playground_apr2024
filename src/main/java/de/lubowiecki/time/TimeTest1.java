package de.lubowiecki.time;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TimeTest1 {

    public static void main(String[] args) {

        Date d1 = new Date();
        System.out.println(d1);

        System.out.println(System.currentTimeMillis());
        d1 = new Date(2024, 10, 12);
        System.out.println(d1);

        System.out.println();

        LocalDate ld1 = LocalDate.now(); // Aktuelles Datum
        ld1 = LocalDate.of(2024, 1, 15);
        ld1 = LocalDate.of(2024, Month.MARCH, 15);
        System.out.println(ld1);

        LocalTime lt1 = LocalTime.now();
        lt1 = LocalTime.of(15, 22, 17);
        System.out.println(lt1);

        LocalDateTime ldt1 = LocalDateTime.now();
        ldt1 = LocalDateTime.of(ld1, lt1);
        ldt1 = LocalDateTime.of(2015, 7, 22, 18, 15, 10);
        System.out.println(ldt1);

        ld1 = ld1.plusDays(25);
        System.out.println(ld1);

        ld1 = ld1.plus(10, ChronoUnit.YEARS);
        System.out.println(ld1);

        Period abstand = Period.ofMonths(24);
        ld1 = ld1.minus(abstand);
        System.out.println(ld1);
    }
}
