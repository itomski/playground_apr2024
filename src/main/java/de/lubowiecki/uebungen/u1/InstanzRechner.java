package de.lubowiecki.uebungen.u1;

public class InstanzRechner {

    String protokoll = "";

    // Instanzmethoden
    double add(double a, double b) {
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

    private void addToProtokoll(double a, double b, char op, double erg) {
        protokoll += "" + a + op + b + "=" + erg + "\n";
    }

    String getProtokoll() {
        return protokoll;
    }
}
