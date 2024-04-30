package de.lubowiecki.oop;

public class HasATest {

    public static void main(String[] args) {

        Adresse addr1 = new Adresse();
        addr1.setStrasse("Musterweg");
        addr1.setNr("22b");
        addr1.setPlz("23456");
        addr1.setOrt("Musterstedt");

        Person p = new Person("Peter", "Parker", addr1);

        Parkhaus parkhaus = new Parkhaus();
        parkhaus.setVerwalter(p);

        parkhaus.addFahrzeug(new Fahrzeug("HH:AB123"));
        parkhaus.addFahrzeug(new Fahrzeug("HH:XY773"));
        parkhaus.addFahrzeug(new Fahrzeug("HH:OX199"));
        parkhaus.addFahrzeug(new Fahrzeug("HH:ML1822"));
    }
}
