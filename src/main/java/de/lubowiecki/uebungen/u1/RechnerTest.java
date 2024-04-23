package de.lubowiecki.uebungen.u1;

public class RechnerTest {

    public static void main(String[] args) {

        System.out.println(StaticRechner.add(10, 8)); // Klassenmethoden werden benutzt
        System.out.println(StaticRechner.sub(10, 8));
        System.out.println(StaticRechner.multi(10, 8));
        System.out.println(StaticRechner.div(10, 8));

        System.out.println();

        InstanzRechner rechner1 = new InstanzRechner(); // Instanz wird gebaut
        System.out.println(rechner1.add(10, 8)); // Instanzmethoden werden benutzt
        System.out.println(rechner1.sub(10, 8));
        System.out.println(rechner1.multi(10, 8));
        System.out.println(rechner1.div(10, 8));

        System.out.println();
        System.out.println(rechner1.getProtokoll());


        System.out.println();

        InstanzRechner rechner2 = new InstanzRechner();
        System.out.println(rechner2.sub(10, 8));
        System.out.println(rechner2.add(10, 8));
        System.out.println(rechner2.multi(10, 8));
        System.out.println(rechner2.div(10, 8));

        System.out.println();
        System.out.println(rechner2.getProtokoll());


    }
}
