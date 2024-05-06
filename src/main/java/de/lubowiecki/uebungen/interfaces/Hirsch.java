package de.lubowiecki.uebungen.interfaces;

public class Hirsch implements Sozialisiert {

    private String name;

    public Hirsch(String name) {
        this.name = name;
    }

    @Override
    public void fressen() {
        System.out.println(name + " frisst Gras");
    }

    @Override
    public void schlaffen() {
        System.out.println(name + " pennt im Stehen");
    }
}
