package de.lubowiecki.vererbung;

public class FachPerson extends Person {

    private String fach;

    public FachPerson() {
        System.out.println("FachPerson");
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }
}
