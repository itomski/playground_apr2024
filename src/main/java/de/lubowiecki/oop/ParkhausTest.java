package de.lubowiecki.oop;

import java.util.Scanner;

public class ParkhausTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        Fahrzeug f1 = new Fahrzeug("HH:AB123", "Kleinwagen");
        Fahrzeug f2 = new Fahrzeug("HH:XY337", "SUV");

        System.out.println(f1.getKennzeichen());
        System.out.println(f1.getKlasse());

        System.out.println(f2.getKennzeichen());
        System.out.println(f2.getKlasse());

        System.out.println();
        */

        // Verwaltung in einem Array
        Fahrzeug[] parkhaus = new Fahrzeug[5]; // leeres Array mit Platz für 10 Fahrzeuge

        /* // Verwendung veschiedener Konstruktoren
        Fahrzeug f1 = new Fahrzeug("dfjsgdjf", "fsdkfhdskfdsh");
        Fahrzeug f2 = new Fahrzeug("dfjsgdjf" );
        Fahrzeug f3 = new Fahrzeug();
        */

        //parkhaus[0] = f1;
        //parkhaus[1] = f2;

        while(true) {
            System.out.print("Kennzeichen: ");
            String kennzeichen = scanner.nextLine();
            System.out.print("Klasse: ");
            String klasse = scanner.nextLine();

            Fahrzeug f = new Fahrzeug(kennzeichen, klasse);
            int freierPlatz = getNaechsteFreiePosition(parkhaus);

            if(freierPlatz == -1) {
                System.out.println("Parkplatz ist voll");
                break;
            }

            parkhaus[freierPlatz] = f; // Fahrzeug wurde eingeparkt
            System.out.println("Fahrzeug wurde eingeparkt!");
            System.out.println();

            zeigeParkhaus(parkhaus);

            System.out.println();
        }
    }

    static void zeigeParkhaus(Fahrzeug[] parkhaus) {

        // Laufe das Array durch
        for (int i = 0; i < parkhaus.length ; i++) {
            if(parkhaus[i] != null) {
                System.out.println(parkhaus[i].getKennzeichen() + ", " + parkhaus[i].getKlasse());
            }
            else {
                System.out.println("Leer");
            }
        }
    }

    static int getNaechsteFreiePosition(Fahrzeug[] parkhaus) {
        for (int i = 0; i < parkhaus.length; i++) {
            if(parkhaus[i] == null) { // null = der Parkplatz ist leer
                return i;
            }
        }
        return -1;
    }
}
