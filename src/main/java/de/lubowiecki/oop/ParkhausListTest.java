package de.lubowiecki.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkhausListTest {

    private ArrayList<Fahrzeug> parkhaus = new ArrayList<>();
    private final int MAX_NUM = 10;

    private Scanner scanner = new Scanner(System.in);

    // Strings, die sich nicht ändern sollten immer final (Konstanten) sein
    private final String ROW_FORMAT = "| %-12s | %-20s | \n";
    private final String DEVIDER = "--------------------------------------- \n";

    public static void main(String[] args) {
        new ParkhausListTest().start();
    }

    private void start() {

        while(true) {
            if(parkhaus.size() == MAX_NUM) {
                System.out.println("Parkhaus ist voll");
                break;
            }

            System.out.print("Kennzeichen: ");
            String kennzeichen = scanner.nextLine();
            System.out.print("Klasse: ");
            String klasse = scanner.nextLine();
            //Fahrzeug f = new Fahrzeug(kennzeichen, klasse);
            //parkhaus.add(f);
            parkhaus.add(new Fahrzeug(kennzeichen, klasse));
            System.out.println("Fahrzeug wurde geparkt");

            zeigeParkhaus();
        }
    }

    private void zeigeParkhaus() {

        System.out.println();
        // ROW_FORMAT ist das String-Template
        // "Kennzeichen", "Klasse" sind Werte, die für die Platzhalter eingesetzt werden
        System.out.printf(ROW_FORMAT, "Kennzeichen", "Klasse");
        System.out.print(DEVIDER);

        for(Fahrzeug f : parkhaus) {
            System.out.printf(ROW_FORMAT, f.getKennzeichen(), f.getKlasse());
        }

        System.out.print(DEVIDER);
    }
}
