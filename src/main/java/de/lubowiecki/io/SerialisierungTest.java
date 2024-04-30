package de.lubowiecki.io;

import de.lubowiecki.oop.Fahrzeug;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SerialisierungTest {

    static final String HOME = System.getProperty("user.home"); // Benutzerordner

    static final String FILE_NAME = HOME + "/fahrzeuge.ser";

    static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        ArrayList<Fahrzeug> altDaten = readFromFile();
        System.out.println(altDaten);

        System.out.println();

        System.out.print("Kennzeichen: ");
        String kennzeichen = scanner.nextLine();
        System.out.print("Klasse: ");
        String klasse = scanner.nextLine();

        altDaten.add(new Fahrzeug(kennzeichen, klasse));

        writeInFile(altDaten);
    }

    static ArrayList<Fahrzeug> readFromFile() {

        ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();

        // Deserialisieriung
        // Inhalt einer Datei wird wieder in Objekte übersetzt
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            fahrzeuge = (ArrayList<Fahrzeug>) in.readObject();
        }
        catch(IOException | ClassNotFoundException ex) { // Beide Exceptions werden hier gecatcht
            ex.printStackTrace();
        }

        return fahrzeuge;
    }

    static void writeInFile(ArrayList<Fahrzeug> fahrzeuge) {
        // Serialisieriung
        // Objekte und Objektsammlungen werden in eine Datei geschrieben
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(fahrzeuge);
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
