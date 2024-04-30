package de.lubowiecki.oop;

public class Person {

    // Zustand der Peron ist IMMUTABLE

    private final String vorname;

    private final String nachname;

    // Person HAS-A Adresse
    private Adresse adresse;

    public Person(String vorname, String nachname, Adresse adresse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }
}
