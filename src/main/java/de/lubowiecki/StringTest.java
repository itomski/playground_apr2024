package de.lubowiecki;

public class StringTest {

    public static void main(String[] args) {

        String str1 = "Hallo"; // Landet im String-Literal-Pool
        String str2 = new String("Hallo"); // Landet NICHT im String-Literal-Pool
        String str3 = new String("Hallo");
        String str4 = "Hallo"; // Verwendet den String aus dem String-Literal-Pool

        str2 += " Text";
        str1 += " Pool";
        str1 = str1.toLowerCase();

        str3 = null;
        //System.out.println(str3.toLowerCase()); // NullPointerException: str3 zeigt auf null

        // Referenzvergleich
        System.out.println(str1 == str2); // == für Objekte: Ist es das gleiche Objekt auf dem Heap
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str2 == str3);

        System.out.println();

        str1 = "1234";
        str3 = "1234";

        // Inhaltsvergleich
        System.out.println(str1.equals(str3));

        // primitive Datentypen haben keine Methoden d.h. auch keine equals-Methode
        // Vergleich des Inhalts wird mit == durchgeführt

        // komplexe Datentypen haben Methoden d.h. auch eine equals-Methode
        // Vergleich des Inhalts wird mit equals durchgeführt
        // Vergleich der Referenz (ist es das gleiche Objekt auf dem Heap) wird mit == durchgeführt

    }
}
