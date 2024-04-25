package de.lubowiecki.uebungen.u2;

import java.util.Arrays;

public class DiceCupTest {

    public static void main(String[] args) {

        DiceCup cup = new DiceCup(6);
        //DiceCup cup = new DiceCup();

        int erg = cup.roll();
        System.out.println(erg);

        erg = cup.roll();
        System.out.println(erg);

        erg = cup.roll();
        System.out.println(erg);

        System.out.println();

        int[] randNumbers = cup.roll(10);
        System.out.println(Arrays.toString(randNumbers));

        cup.stats(randNumbers);
    }
}
