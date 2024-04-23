package de.lubowiecki;

public class Mathematik {

    // int sind Ganzzahlen
    // double sind Fließkommazahlen

    static int modulo(int a, int b) { // Klassenmethode
        return a % b; // return gibt einen Wert an den Aufrufer der Methode zurück
    }

}

// Wenn nicht public, dann ist die Klasse nur für andere Klassen im gleichen package sichtbar
class Wert {

}
