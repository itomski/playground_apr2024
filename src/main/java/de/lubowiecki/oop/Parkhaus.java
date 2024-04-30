package de.lubowiecki.oop;

import java.util.ArrayList;

public class Parkhaus {

    // Parkhaus HAS-A Fahrzeug (1:n)
    private ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();

    // Parkhaus HAS-A Person (1:1)
    private Person verwalter;

    public void addFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeuge.add(fahrzeug);
    }

    public void setVerwalter(Person verwalter) {
        this.verwalter = verwalter;
    }
}
