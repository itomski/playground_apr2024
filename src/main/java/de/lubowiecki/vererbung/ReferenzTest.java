package de.lubowiecki.vererbung;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReferenzTest {

    public static void main(String[] args) {

        Object o = new String("Hallo"); // String ist eine Kindklasse von Object
        o = 11; // int Autoboxing zu Integer, Integer ist eine Kindklasse von Object

        System.out.println(o);

        Number n1 = 100; // int Autoboxing zu Integer, Integer ist eine Kindklasse von Number
        System.out.println(n1.doubleValue());
        n1 = 10.0; // double Autoboxing zu Double, Double ist eine Kindklasse von Number
        System.out.println(n1.doubleValue());

        System.out.println();

        CharSequence cSeq = "Hallo";
        cSeq = new StringBuilder("Das ist das Haus von Nikigraus").append("...");
        System.out.println(cSeq.subSequence(2, 10));

        System.out.println();

        //ArrayList<String> namen = new ArrayList<>();

        // List: Interface
        // ArrayList: Konkrete Klasse aus der das Objekt erzeugt wird
        // Links: Referenztyp
        // Rechts: Objekttyp
        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");

        System.out.println(namen.get(2));

        for(String name : namen) {
            System.out.println(name);
        }

        namen = new LinkedList<>(namen); // Wechsel des Objekttyps von ArrayList auf LinkedList
        namen = new ArrayList<>(namen); // Wechsel des Objekttyps von LinkedList auf ArrayList
    }
}
