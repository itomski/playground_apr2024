package de.lubowiecki.vererbung;

import java.awt.*;

public class InterfaceTest {

    public static void main(String[] args) {

        Movable m1 = new Fahrrad();
        //m1 = new Pkw();
        //m1 = new Lkw();
        //m1 = "Hallo Welt"; // Error: String implementiert NICHT das Movable interface

        m1.move(10, 15);
    }
}

interface Movable {

    void move(int x, int y); // Abstrakte Methode: Ist nicht fertig ausprogrammiert

}

class Fahrrad implements Movable { // Fahrrad erbt die Verpflichtung die Methoden des Interface einzubauen

    private Point pos = new Point(); // 2d Punkt

    @Override
    public void move(int x, int y) {
        pos.move(x, y);
    }

}

class Pkw implements Movable {

    private int x;
    private int y;

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Lkw implements Movable {

    private double posX;
    private double posY;

    @Override
    public void move(int x, int y) {
        this.posX = x;
        this.posY = y;
    }
}