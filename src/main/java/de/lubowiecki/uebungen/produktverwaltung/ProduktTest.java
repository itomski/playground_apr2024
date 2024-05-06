package de.lubowiecki.uebungen.produktverwaltung;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProduktTest {

    public static void main(String[] args) {

        List<Produkt> produkte = new ArrayList<>();
        produkte.add(new Produkt("Tasse", "Keramik, blau", 100, 5.99));

        // VerderblichesProdukt IS-A Produkt
        produkte.add(new VerderblichesProdukt("Milch", "1,5% Fett", 100, 1.29, LocalDate.now()));

        for(Produkt p : produkte) {
            System.out.println(p.getName());
            if(p instanceof VerderblichesProdukt) { // Prüft die Identität auf dem Heap
                VerderblichesProdukt vp = (VerderblichesProdukt) p; // Wenn es kein VerderblichesProdukt ist dann ClassCastException
                System.out.println(vp.getMdh());
            }
        }
    }
}
