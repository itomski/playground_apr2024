package de.lubowiecki.oop;

import java.io.Serializable;

public class Fahrzeug implements Serializable { // Serializable heißt es darf von Java in Dateien geschrieben werden


    private String kennzeichen; // Standard: null

    private String klasse; // Standard: null

    // Konstruktor belegt das Objekt bei der Erzeugung mit Startwerten
    public Fahrzeug(String kennzeichen, String klasse) {
        this.kennzeichen = kennzeichen;
        this.klasse = klasse;
    }

    public Fahrzeug(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        this.klasse = "Unbekannt";
    }

    // Defaultkonstruktor - wird von Java bereitgestellt, wenn kein eigener Konstruktor vorhanden ist
    public Fahrzeug() {
        this.kennzeichen = "Unbekannt";
        this.klasse = "Unbekannt";
    }

    public String getKennzeichen() {
        return kennzeichen; // return verlässt die Methode
        // System.out.println("..."); // Kompilererror - Statement ist nicht erreichbar
    }

    public String getKlasse() {
        return klasse;
    }

    /*
    @Override
    public String toString() {
        // String sind nicht veränderbar. Verkettung produziert mehrere Versionen eines Strings
        return "Fahrzeug{" +
                "kennzeichen='" + kennzeichen + '\'' +
                ", klasse='" + klasse + '\'' +
                '}';
    }
    */

    @Override
    public String toString() {
        // StringBuilder: ein veränderbarer "String"
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", klasse='").append(klasse).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
