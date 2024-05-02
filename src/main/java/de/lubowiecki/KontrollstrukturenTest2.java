package de.lubowiecki;

public class KontrollstrukturenTest2 {

    public static void main(String[] args) {

        Wochentag tag = Wochentag.SA;

        // Nur ganzzahlen (ohne long), char, String und ENUMs erlaubt
        switch(tag) {

            case MO:
            case DI:
            case MI:
            case DO:
            case FR:
                System.out.println("Innerhalb der Woche");
                break;

            case SA:
            case SO:
                System.out.println("Wochenende");

            default: // Optional
        }

        /*
        for(;;) { // Endlosschleife
            System.out.println("Hi");
        }
        */

        for(;;System.out.println("Hi"));

    }
}

enum Wochentag {

    MO, DI, MI, DO, FR, SA, SO;

}