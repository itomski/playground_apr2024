package de.lubowiecki;

public class HundTest {

    // Ausführbare Programme brauchen eine main-Methode
    public static void main(String[] args) {

        // Objekte sind Einheiten von Informationen

        // Hund = Komplexer Datentyp
        // h1 = Name der Variable
        // = ist eine Zuweisung
        // new Hund() = Aus der Klasse Hund wird ein neues Objekt/eine Instanz gebaut
        Hund h1 = new Hund();
        h1.name = "Peter";
        h1.rasse = "Dackel";
        h1.print();

        System.out.println(); // leerzeile

        Hund h2 = new Hund();
        h2.name = "Bruce";
        h2.print(); // Aufruf einer Methode

        System.out.println();

        Hund h3 = new Hund();
        h3.name = "Carol";
        h3.print();

        System.out.println();

        //print("Hallo") // Aufruf einer Funktion - In Java gibt es keine Funktionen

        // Klasse System enthält eine Variable out, die den Ausgabestrom kontrolliert
        // println() ist eine Methode des Ausgabestroms
        System.out.println(h1.name); // h1.name = Variable name aus dem Hund-Objekt in der Variable h1
        System.out.println(h2.gesund);
        System.out.println(h3.rasse);


    }
}
