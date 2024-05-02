package de.lubowiecki.vererbung;

import java.time.LocalDate;
import java.util.ArrayList;

public class VererbungTest1 {

    public static void main(String[] args) {

        // Student IS-A FachPerson IS-A Person

        // Elternklasse: FachPerson
        // Geschwisterklasse: Dozent
        Student s1 = new Student();
        s1.setVorname("Peter");
        s1.setNachname("Parker");
        s1.setMartikelNr("12345XYZ");
        s1.setFach("Wirtschafts Informatik");
        s1.setGeburtsDatum(LocalDate.of(1998, 5, 22));

        System.out.println();

        // Dozent IS-A FachPerson IS-A Person

        // Elternklasse: FachPerson
        // Geschwisterklasse: Student
        Dozent d1 = new Dozent();
        d1.setVorname("Bruce");
        d1.setNachname("Banner");
        d1.setGeburtsDatum(LocalDate.of(1972, 6, 10));
        d1.setFach("Wirtschafts Informatik");

        // Auf eine Variable vom Typ Person können Objekte aller Kindklassen von Person zugewiesen werden
        // Über eine Referenz vom Typ Person, sind nur Methoden und Eigenschaften sichtbar, die in Person
        // deklariert sind
        Person p1 = s1; // Student IS-A Person
        p1 = d1; // Dozent IS-A Person

        System.out.println(p1.getVorname() + " " + p1.getNachname() + ", " + p1.getGeburtsDatum());
        p1 = s1;
        System.out.println(p1.getVorname() + " " + p1.getNachname() + ", " + p1.getGeburtsDatum());

        System.out.println();

        ArrayList<FachPerson> personen = new ArrayList<>();
        personen.add(s1); // Student IS-A FachPerson
        personen.add(d1); // Dozent IS-A FachPerson

        for(FachPerson fp : personen) {
            System.out.println(fp.getVorname() + " " + fp.getNachname() + ", " + fp.getGeburtsDatum() + ", " + fp.getFach());
        }


    }



}
