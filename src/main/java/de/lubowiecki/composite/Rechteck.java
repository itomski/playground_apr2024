package de.lubowiecki.composite;

public class Rechteck extends GeoForm {

    private int laenge;
    private int breite;

    public Rechteck(int x, int y, int laenge, int breite) {
        setX(x);
        setY(y);
        this.laenge = laenge;
        this.breite = breite;
    }

    public int getLaenge() {
        return laenge;
    }

    public int getBreite() {
        return breite;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rechteck{");
        sb.append("x=").append(getX());
        sb.append(", y=").append(getY());
        sb.append(", laenge=").append(laenge);
        sb.append(", breite=").append(breite);
        sb.append('}');
        return sb.toString();
    }
}
