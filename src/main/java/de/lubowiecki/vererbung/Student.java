package de.lubowiecki.vererbung;

// Student erbt alle nicht privaten Eigenschaften und Methoden von Person
public class Student extends FachPerson {

    private String martikelNr;

    public Student() {
        System.out.println("Student");
    }

    public String getMartikelNr() {
        return martikelNr;
    }

    public void setMartikelNr(String martikelNr) {
        this.martikelNr = martikelNr;
    }
}
