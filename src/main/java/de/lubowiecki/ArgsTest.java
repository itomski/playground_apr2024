package de.lubowiecki;

public class ArgsTest {

    // public = für alle sichtbar
    // static = Klassenmethode. Für den Aufruf wird kein Objekt benötigt
    // void = Liefert keine Werte zurück
    // main = Name der Methode
    // (...) = Parameterliste
    // String[] args = Sammlung an Strings, die beim Start des Programms als Argumente übergeben wurden

    // Aurfuf auf der CMD
    // Argumente: 10 15 100 720
    // java de.lubowiecki.ArgsTest 10 15 100 720

    public static void main(String[] args) {

        // Package java.lang ist immer automatisch importiert
        // Jede Klasse, die sich ausßerhalb meines Packages befindet, muss importiert werden

        /*
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        */

        // Schleife - Gibt alle Programm-Argumente aus
        for (int i = 0; i < args.length ; i++) {
            System.out.println(args[i]);
        }

        Fleischwolf fw1 = new Fleischwolf();
        String teller = fw1.machHack("Fleisch");
        System.out.println(teller);

        teller = fw1.machHack("Gemüse");
        System.out.println(teller);

        teller = fw1.machHack("Buch");
        System.out.println(teller);
    }
}
