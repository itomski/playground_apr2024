package de.lubowiecki.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;

public class FileTest {

    public static void main(String[] args) {

        // Arrays, Collections

        Path pfad = Paths.get("data.txt");

        zeigeInhalt(pfad);

        System.out.println();

        schreibeInhalt(pfad, "Dies und das.");

        zeigeInhalt(pfad);

        System.out.println();

        System.out.println("Programmende.");
    }

    static void schreibeInhalt(Path path, String inhalt) {

        // try-with-resoureces
        try(BufferedWriter out = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
            out.append(inhalt);
            out.newLine(); // Zeilenumbruch
        }
        catch(IOException ex) {
            System.out.println("Problem: " + ex.getMessage());
        }
    }

    static void zeigeInhalt(Path pfad) {

        try(BufferedReader in = Files.newBufferedReader(pfad)) { // Verbindung zu der Datei wird aufgebaut
            // String line = in.readLine(); // Eine Zeile wird gelesen
            // System.out.println(line);

            String line;
            while((line = in.readLine()) != null) { // Daten werden Zeile für Zeile gelesen
                System.out.println(line);
            }
            // die Resource in wird hier automatisch geschlossen
        }
        catch(IOException ex) { // Sollte ein Problem auftauchen, wird dieses hier behandelt
            System.out.println("Problem: " + ex.getMessage());
        }
    }
}
