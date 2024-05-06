package de.lubowiecki.vererbung;

public class Überschreiben {

    public static void main(String[] args) {

        check(new Backen());
        check(new Kochen());
        check(new Basteln());
        check(() -> System.out.println("Dies und das...")); // Lambda seit Java 1.8

    }

    static void check(Machbar m) {
        // Für die Ausführung der Methode ist nicht der Referenztyp (Machbar) entscheidend,
        // sondern der Objekttyp auf dem Heap
        m.machEs();
    }
}


interface Machbar {

    void machEs(); // abstrakte Methode (noch nicht fertig)
}

class Kochen implements Machbar {

    @Override
    public void machEs() {
        System.out.println("Kocht Essen");
    }
}

class Backen implements Machbar {

    @Override
    public void machEs() { // Methode aus der Interface/Eltern Klasse wird überschrieben
        System.out.println("Backt Brot");
    }
}

class Basteln implements Machbar {

    @Override
    public void machEs() {
        System.out.println("Bastelt einen Nachtschrank.");
    }
}