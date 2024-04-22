package de.lubowiecki;

import java.time.LocalDate; // Die Klasse kann mit Klassennamen verwendet werden
import java.util.Date;
//import java.sql.Date;

// Klasse - Bauplan
// Konkrete Objekte sind Vertreter einer bestimmten Klasse
public class Start { // de.lubowiecki.Start

    // Konventionen

    // PascaleCase: Klassennamen (beginnen mit Großbuchstaben)
    // camelCase: Eigenschaften, Methoden und Variablen (beginnen mit Kleinbuchstaben)
    // snake_case: wird in Java nicht benutzt
    // SCREAMING_SNAKE_CASE: (öffentliche) Konstanten


    // Einstiegspunkt
    // Methode - Eine Funktion, die zu einer Klasse gehört
    public static void main(String[] args) {

        //int zahl = 100.0;
        var zahl = 100; // seiot Java 1.9

        System.out.println("Das ist die Zahl: " + zahl);
        //System.out.println("Heute: " + java.time.LocalDate.now());
        System.out.println("Heute: " + LocalDate.now());
        System.out.println("Heute: " + new Date());
        //System.out.println("Heute: " + new java.sql.Date(...));

    } // Ende der main-Methode = Ende des Programms
}