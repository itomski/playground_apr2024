package de.lubowiecki.uebungen.interfaces;

public class Waschbaer implements Sozialisiert {

    private String name;

    public Waschbaer(String name) {
        this.name = name;
    }

    @Override
    public void fressen() {
        System.out.println(name + " wäscht das Futter und frisst es auf.");
    }

    @Override
    public void schlaffen() {
        System.out.println(name + " schläft nicht. Geht den Müll durchsuchen.");
    }
}
