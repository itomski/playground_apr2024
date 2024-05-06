package de.lubowiecki.uebungen.produktverwaltung;

import java.time.LocalDate;

public class VerderblichesProdukt extends Produkt {

    private LocalDate mdh;

    public VerderblichesProdukt(String name, String beschreibung, int anzahl, double preis, LocalDate mdh) {
        super(name, beschreibung, anzahl, preis); // Aufruf des Konstruktors der Elternklasse
        this.mdh = mdh;
    }

    public LocalDate getMdh() {
        return mdh;
    }

    public void setMdh(LocalDate mdh) {
        this.mdh = mdh;
    }

    @Override
    public String getName() {
        return super.getName() + "...";
    }
}
