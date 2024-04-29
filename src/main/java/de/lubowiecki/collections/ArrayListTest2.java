package de.lubowiecki.collections;

import java.util.ArrayList;

public class ArrayListTest2 {

    public static void main(String[] args) {

        // <String> : Generischer Typ - dürfen nur komplex sein!!!!
        ArrayList<String> namen = new ArrayList<>();
        namen.add("Peter"); // 0
        namen.add("Bruce"); // 1
        namen.add(0, "Carol"); // Auf einen gewünschten Index ablegen
        // Andere Elemente werden ggfl. verschoben

        namen.remove("Bruce"); // Entfernt Bruce aus der Liste
        namen.remove(0); // Entfernt das Element auf dem Index 0
        // Andere Elemente werden ggfl. verschoben

        if(namen.contains("Peter")) { // Prüft, ob der Wert in der Liste enthalten ist
            System.out.println("Peter ist enthalten");
        }

        namen.add("Tony");
        namen.add("Scott");

        // ggfl. IndexOutOfBounds, wenn Position in der Liste nicht verfügbar
        System.out.println(namen.get(2)); // Liefert den Element auf dem gewüschten Index

        // indexOf liefert den Index
        System.out.println(namen.indexOf("Tony"));
        System.out.println(namen.indexOf("Bruce")); // -1 = Element in der Liste nicht verfügbar

        // Listen sind geordnet - aber nicht sortiert
        // Können doppelten Werte und null aufnehmen
        // Jedes Element bekommt einen Index
        // Index startet IMMER mit 0
        // Wahlfreierzugriff ist sehr schnell
        // Hinzufügen und Entfernen von Elementen mitten in der Liste ist langsam

    }
}
