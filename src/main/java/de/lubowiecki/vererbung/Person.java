package de.lubowiecki.vererbung;

import java.time.LocalDate;

public class Person {

    private String vorname;
    private String nachname;

    private LocalDate geburtsDatum;

    public Person() {
        System.out.println("Person");
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }
}
