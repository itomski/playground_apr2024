package de.lubowiecki;

import java.util.HashSet;
import java.util.Objects;

public class ObjekteVergleichen {

    public static void main(String[] args) {

        /*
        ContentBox cb1 = new ContentBox();
        cb1.setContent("Hallo Box");

        ContentBox cb2 = new ContentBox();
        cb2.setContent("Hallo Box");

        ContentBox cb3 = cb1;

        // == Referenzvergleich
        System.out.println(cb1 == cb2);
        System.out.println(cb1 == cb3);

        System.out.println();

        // Standardimplementierung von equals aus Object vergleicht die Referenzen (wie ==)
        // equals Inhaltsvergleich
        System.out.println(cb1.equals(cb2));
        System.out.println(cb1.equals(cb3));
        System.out.println(cb1.equals(null));

        System.out.println();

        System.out.println(cb1.hashCode());
        System.out.println(cb2.hashCode());
        System.out.println(cb3.hashCode());
        */

        // Hash basierte Datenstruktur
        HashSet<ContentBox> boxen = new HashSet<>();
        ContentBox cb4 = new ContentBox();
        cb4.setContent("Kiel");
        boxen.add(cb4);

        ContentBox cb5 = new ContentBox();
        cb5.setContent("München");
        boxen.add(cb5);

        ContentBox cb6 = new ContentBox();
        cb6.setContent("Berlin");
        boxen.add(cb6);

        System.out.println(boxen);

        ContentBox cb7 = new ContentBox();
        cb7.setContent("München");
        boxen.add(cb7);

        System.out.println(boxen);

    }
}

class ContentBox {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Überschreiben heißt:
    // Die geerbte Version aus der Klasse Object, wird mit einer eigenen Version ÜBERRSCHRIEBEN/ersetzt

    @Override
    public boolean equals(Object other) {
        System.out.println("EQUALS");
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        ContentBox that = (ContentBox) other;
        return Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        System.out.println("HASHCODE");
        return Objects.hash(content);
    }
}
