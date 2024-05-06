package de.lubowiecki.uebungen.interfaces;

public class GehegeTest {

    public static void main(String[] args) {

        Tiergehege gehege = new Tiergehege();
        gehege = new Freigehege();
        gehege.hinzufuegen(new Hirsch("Dieter"));
        gehege.hinzufuegen(new Waschbaer("Anna"));
        gehege.starteFuetterung();
        gehege.starteNachruhe();

    }
}
