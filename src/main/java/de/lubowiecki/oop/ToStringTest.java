package de.lubowiecki.oop;

public class ToStringTest {

    public static void main(String[] args) {

        Fahrzeug f = new Fahrzeug("HH:AB123", "Kleinwagen");
        System.out.println(f); // Objekt wird in String konvertiert, dazu wird automatisch toString verwendet

        // Standardimplementierung: // getClass().getName() + "@" + Integer.toHexString(hashCode());
        System.out.println(f.toString());

        // Deklariert eine Klasse keine eigene toString-Methode, erbt sie den Standard aus der Klasse-Object

    }
}
