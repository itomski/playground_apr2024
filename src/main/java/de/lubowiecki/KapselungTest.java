package de.lubowiecki;

public class KapselungTest {

    public static void main(String[] args) {

        // o1: Referenz (liegt auf dem Stack)
        // Object: Eine Instanz liegt auf dem Heap
        Object o1 = new Object();

        o1 = null; // Referenz wird von dem Objekt auf dem Heap getrennt

        if(o1 == null) {
            int zahl = 100; // Scope der Variable ist auf den umgebenden Block eingeschränkt
            System.out.println(zahl);
        }

        //System.out.println(zahl); // Hier nicht mehr sichtbar

        { // sub-block
            System.out.println(o1); // Variablen im übergeordnetem Block sind in sub-blöcken sichtbar
            int x = 10;
            int y = 20;
            System.out.println(x + y);
        }

        // x und y sind out of scope
        // System.out.println(x + y); // x und y nicht mehr sichtbar

        machWas();
        // o1 aus der Methode machWas ist hier out of scope

    }

    static void machWas() { // Jede Methode hat ihren eigenen Scope

        String o1 = "Hallo";

    }
}
