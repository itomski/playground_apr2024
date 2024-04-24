package de.lubowiecki.uebungen.u2;

public class DiceCupTest {

    public static void main(String[] args) {

        DiceCup cup = new DiceCup(20);
        //DiceCup cup = new DiceCup();

        int erg = cup.roll();
        System.out.println(erg);

        erg = cup.roll();
        System.out.println(erg);

        erg = cup.roll();
        System.out.println(erg);

        System.out.println();

        cup.roll(5);

    }
}
