package de.lubowiecki.uebungen.interfaces;

public class Freigehege extends Tiergehege {

    @Override // Überschreiben = Anpassung einer geerbten Methode
    public void starteFuetterung() {
        System.out.println("Fütterung im Freigehege wird gestartet:");
        for(Sozialisiert s : getTiere()) {
            s.fressen();
        }
    }
}
