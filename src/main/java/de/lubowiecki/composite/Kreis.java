package de.lubowiecki.composite;

public class Kreis extends GeoForm {

    private int radius;

    public Kreis(int x, int y, int radius) {
        setX(x);
        setY(y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kreis{");
        sb.append("x=").append(getX());
        sb.append(", y=").append(getY());
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
