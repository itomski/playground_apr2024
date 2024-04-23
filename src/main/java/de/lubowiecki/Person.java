package de.lubowiecki;

public class Person {

    private static int count; // Klassenvariable
    private int id; // Instanzvariablen
    private String vorname;
    private String nachname;

    // Klassenvariablen bleiben im Speicher, bis das Programm beendet ist
    // Instanzvariablen bleiben im Speicher, bis das Objekt entfernt wird
    // Lokale Variablen bleiben im Speicher, bis die Methode beendet ist

    // Konstruktor
    public Person() { // wird beim Aufruf von new Person() verwendet
        id = ++count; // ++ = Increment, um 1 erhöhen
    }

    public Person(String vorname, String n) {
        id = ++count;
        // voraname = lokale Variable
        // this.voraname = Instanzvariable
        this.vorname = vorname;
        nachname = n; // this ist nur nötig, wenn eine lokale Variable die Instanzvariable überlagert
    }

    public int getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        // Lokale Variablen können Parameter der Methode sein
        // Oder sind Variablen, die in einem Methode deklariert werden
        int zahl = 10; // Deklaration und Initialisierung einer lokalen Variable
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    @Override
    protected void finalize() throws Throwable { // Destructor - ist seit Java 9 veraltet
        super.finalize();
    }
}
