package de.lubowiecki.uebungen.u1;


/**
 * Enthält die Grudrechenarten
 */
public class InstanzRechner {

    String protokoll = "";

    // Instanzmethoden
    double add(double a, /* Bla bla bla */ double b) {
        double erg = a + b;
        //protokoll += a + "+" + b + "=" + erg + "\n";
        addToProtokoll(a, b, '+', erg);
        return erg;
    }

    double sub(double a, double b) {
        double erg = a - b;
        //protokoll += a + "-" + b + "=" + erg + "\n";
        addToProtokoll(a, b, '-', erg);
        return erg;
    }

    double multi(double a, double b) {
        double erg = a * b;
        //protokoll += a + "*" + b + "=" + erg + "\n";
        addToProtokoll(a, b, '*', erg);
        return erg;
    }

    double div(double a, double b) {
        double erg = a / b;
        //protokoll += a + "/" + b + "=" + erg + "\n";
        addToProtokoll(a, b, '/', erg);
        return erg;
    }

    /**
     * Protokolliert eine Mathematische Oeration
     * @param a Operand 1
     * @param b Operand 2
     * @param op Operator
     * @param erg Ergebnis der Rechnung
     */
    private void addToProtokoll(double a, double b, char op, double erg) {
        protokoll += "" + a + op + b + "=" + erg + "\n";
    }

    String getProtokoll() {
        return protokoll;
    }
}
