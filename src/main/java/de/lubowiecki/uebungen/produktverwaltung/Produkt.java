package de.lubowiecki.uebungen.produktverwaltung;

public class Produkt {

    private String name;
    private String beschreibung;
    private int anzahl;
    private double preis;

    public Produkt(String name, String beschreibung, int anzahl, double preis) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
