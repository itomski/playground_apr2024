package de.lubowiecki.jdbc;

public class Fahrzeug {

    private int id;
    private String kennzeichen;
    private String marke;
    private String typ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("id=").append(id);
        sb.append(", kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", typ='").append(typ).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
