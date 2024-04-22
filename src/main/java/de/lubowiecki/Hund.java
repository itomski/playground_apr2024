package de.lubowiecki;

public class Hund {

    // Klassenvariablen - gehören dem Bauplan
    // Instanzvariablen - gehören dem Objekt
    // lokalen Variablen - sind nur während eines Methodenaufrufs verfügbar - gehören einer Methode

    boolean gesund = true; // Instanzvariable

    String name = "Franz Ferdinand";
    String rasse = "Labrador";

    // void = keine Rückgabe
    // print() = Name der Methode

    // Instanzmethoden manipulieren oder lesen den Objektzustand

    void print() { // Instanzmethode
        System.out.println(name + ", " + rasse + ", gesund: " + gesund);
    }

}
