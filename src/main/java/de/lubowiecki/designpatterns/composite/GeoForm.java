package de.lubowiecki.designpatterns.composite;

// abstract = Klasse kann nicht direkt instanziert werden
// sie muss zuert abgeleitet werden
public abstract class GeoForm {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void bewegeAn(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
