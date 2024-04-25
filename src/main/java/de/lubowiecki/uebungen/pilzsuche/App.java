package de.lubowiecki.uebungen.pilzsuche;

import java.util.Scanner;

public class App {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new App().start(); // Wchsel vom Klassenkontext auf Instanzkontext
    }

    private void start() {

        Pilzsuche spiel = new Pilzsuche(5);
        spiel.printSpielfeld();

        System.out.println();

        spiel.neuStart();
        spiel.printSpielfeld();

        System.out.println(spiel.suche(1, 1));
        System.out.println(spiel.suche(2, 2));
        System.out.println(spiel.suche(3, 3));
        System.out.println(spiel.suche(4, 4));
        System.out.println(spiel.suche(2, 1));
        System.out.println(spiel.suche(3, 2));

        System.out.println();

        spiel.printSpielfeld();
    }
}
