package de.lubowiecki.collections;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {


        String[] namen = new String[5];
        //namen[10] = "Peter"; // ArrayIndexOutOfBoundsException
        namen[0] = "Peter";
        namen[1] = "Bruce";

        System.out.println(namen);

        System.out.println();

        for (int i = 0; i < namen.length; i++) {
            System.out.println(namen[i]);
        }

        System.out.println();

        for (String name : namen) {
            System.out.println(name);
        }

        System.out.println();

        // Eine Sammlung von Elementen gleichen Typs
        ArrayList<String> namenListe = new ArrayList<>();
        namenListe.add("Bruce"); // Wert wird an die nächste freie Stelle abgelegt
        namenListe.add("Natasha");
        namenListe.add("Tony");
        System.out.println(namenListe);

        System.out.println();

        for (int i = 0; i < namenListe.size(); i++) {
            System.out.println(namenListe.get(i));
        }

        System.out.println();

        for (String name : namenListe) {
            System.out.println(name);
        }

    }
}
