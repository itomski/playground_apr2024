package de.lubowiecki.uebungen.u2;

import java.util.Random;

public class DiceCup {

    private Random randGen = new Random(); // Instanzvariable

    private final int SIZE; // Konstante

    public DiceCup(int size) {
        SIZE = size;
    }

    public DiceCup() {
        SIZE = 6;
    }

    public int roll() {
        return randGen.nextInt(SIZE) + 1;
    }

    public void roll(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(roll());
        }
    }
}
