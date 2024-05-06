package de.lubowiecki.exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LocalDate ld = null;

        while(true) {
            try {
                System.out.print("Datum:");
                ld = LocalDate.parse(scanner.nextLine()); // parse wandelt einen String in ein LocalDate um
                break;
            }
            catch (DateTimeException ex) {
                System.out.println("Datum ungültig!");
            }
        }

        System.out.println(ld);

    }

}
