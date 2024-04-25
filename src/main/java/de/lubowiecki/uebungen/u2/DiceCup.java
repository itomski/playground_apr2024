package de.lubowiecki.uebungen.u2;

import java.util.Arrays;
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

    public int[] roll(int num) {

        int[] sammlung = new int[num]; // Array in passender Größe
        for (int i = 0; i < sammlung.length; i++) {
            sammlung[i] = roll();
        }
        return sammlung;
    }

    public void stats(int[] numbers) {

        // 0: 2
        // 1: 1
        // 2: 0
        // 3: 0
        // 4: 1
        // 5: 0

        int[] stats = new int[SIZE];
        for(int num : numbers) { // 1, 5, 2, 1
            stats[num - 1]++;
        }

        printStats(stats); // Ausgabe des Statistik
    }

    private void printStats(int[] stats) {
        for (int i = 0; i < stats.length; i++) {
            System.out.println((i + 1) + " x " + stats[i]);
        }
    }
}
