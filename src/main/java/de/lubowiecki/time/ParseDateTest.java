package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ParseDateTest {

    public static void main(String[] args) {


        LocalDate ld = LocalDate.parse("2023-10-17"); // ISO wird erwartet
        System.out.println(ld);
        System.out.println(ld.getDayOfWeek());

        // ld = LocalDate.parse("2023-18-17");
        // System.out.println(ld);

        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        ld = LocalDate.parse("17.12.2023", DATE_FMT);
        System.out.println(ld); // Ausgabe in ISO
        System.out.println(ld.getDayOfWeek());

        System.out.println(ld.format(DATE_FMT));

        Locale.setDefault(Locale.KOREA);
        // ofLocalized... passt sich an Sprache und Location des Systems an
        final DateTimeFormatter DATE_FMT2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(ld.format(DATE_FMT2));

    }
}
