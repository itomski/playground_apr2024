package de.lubowiecki;

public class DatentypTest {

    static int wert;

    public static void main(String[] args) {

        // 5 = Literal
        // zahl = Variable
        // primitiver Datentyp
        byte zahl1 = 5;
        byte zahl2 = 2;

        System.out.println(Math.pow(5, 2));
        System.out.println(Math.pow(zahl1, zahl2));

        // komplexer Datentyp
        Person p1 = new Person();

        zahl1++; // Inkrement: zahl1 = zahl1 + 1
        // 5++; // 5 = 5 + 1; // NICHT ERLAUBT!!!!!!!!

        // Klassen- und Instanz-Variabeln bekommen Standardwerte
        // lokale Variablen bekommen KEINE Standardwerte

        int andererWert;
        andererWert = 100;
        System.out.println(wert);
        System.out.println(andererWert); // Lokale Variablen müssen vor der Verwendung einen Wert bekommen

        byte b1 = 100; // Deklaration und Wertzuweisung
        b1 = -128; // Wertzuweisung

        System.out.println(100); // Ganzzahlen sind automatisch vom Typ int

        //long l1 = 1_000_000_000_000; // Wert zu groß für einen int
        long l1 = 1_000_000_000_000l; // l muss dabei sein, damit es ein long ist

        int zahl = 1001;
        zahl = 0b1001; // 9
        System.out.println(zahl);
        zahl = 011; // 9
        System.out.println(zahl);
        zahl = 0x1f; // 31
        System.out.println(zahl);

        //float f1 = 10.0; // 10.0 ist ein double
        float f1 = 10.0f; // für ein float muss f ran
        double d1 = 10.0;
        d1 = 10.0f; // primitive widening

        // byte < short < int < long < float < double
        //         char <

        int z1 = b1; // primitive widening von byte auf int

        b1 = (byte) z1; // primitive narrowing. In Java nicht automatisch. Cast ist nötig

        int z2 = 1000;
        byte b2 = (byte) z2; // Beim cast ist ein Überlauf/Unterlauf möglich
        System.out.println(b2);

        z1++; // z1 = (int)(z1 + 1);
        z1 += 10; // z1 = (int)(z1 + 10);

        b1 = 126;
        System.out.println(++b1);
        System.out.println(++b1);
        System.out.println(++b1);
        System.out.println(++b1);

        // int + double = int wird zum double, aktion, erg. double
        double sum1 = 10 + 10.0;
        int sum2 = 10 + 10;
        int sum3 = b1 + b2; // byte und short werden beim mathematischen Operationen zu int

        System.out.println('c');
        System.out.println((int)'c');
        int i = 'X'; // primitive widening von char auf int

    }
}
