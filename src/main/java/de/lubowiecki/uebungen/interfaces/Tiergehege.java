package de.lubowiecki.uebungen.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Tiergehege {

    private List<Sozialisiert> tiere = new ArrayList<>();

    public void hinzufuegen(Sozialisiert tier) {
        tiere.add(tier);
    }

    public void starteFuetterung() {
        System.out.println("Fütterung: ");
        for(Sozialisiert s : tiere) {
            s.fressen();
        }
    }

    public void starteNachruhe() {
        System.out.println("Nachtruhe: ");
        for(Sozialisiert s : tiere) {
            s.schlaffen();
        }
    }

    protected List<Sozialisiert> getTiere() {
        return tiere;
    }
}
