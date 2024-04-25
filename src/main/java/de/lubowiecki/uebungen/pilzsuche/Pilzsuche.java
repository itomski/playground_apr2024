package de.lubowiecki.uebungen.pilzsuche;

import java.util.Arrays;
import java.util.Random;

public class Pilzsuche {

    private final int SIZE;

    private final int[][] spielfeld;

    private Random rand = new Random();

    public Pilzsuche(int size) {
        this.SIZE = size;
        spielfeld = new int[SIZE][SIZE];
        setzePilze(SIZE);
    }

    public void neuStart() {
        for(int[] zeile : spielfeld) {
            Arrays.fill(zeile, 0); // Altes Spielfeld wird mit 0 gefüllt
        }
        setzePilze(SIZE); // Danach werden Pilze per Zufall gesetzt
    }

    public boolean suche(int x, int y) {

        // TODO: x und y vaildieren

        if(spielfeld[x][y] > 0) {
            // TODO: Wenn bereits gefunden, dann Hinweis
            spielfeld[x][y] = 2;
            return true;
        }
        return false;
    }

    private void setzePilze(int anzahl) {

        for (int i = 0; i < anzahl; i++) {
            setzePilz();
        }
    }

    private void setzePilz() {
        int x = rand.nextInt(SIZE);
        int y = rand.nextInt(SIZE);

        if(spielfeld[x][y] == 1) { // Wenn Position belegt, dann einen Neuen Versuch starten
            setzePilz();
        }
        else {
            spielfeld[x][y] = 1; // Wenn Position frei, dann Pilz positionieren
        }
    }

    public void printSpielfeld() {

        for(int[] zeile : spielfeld) {
            for(int zelle : zeile) { // Alle Zellen einer Zeile werden ausgegeben
                System.out.print(zelle + " ");
            }
            System.out.println(); // Zeilenumbruch
        }
    }
}
