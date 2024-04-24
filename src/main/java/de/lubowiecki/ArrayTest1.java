package de.lubowiecki;

import java.util.Arrays;

public class ArrayTest1 {

    public static void main(String[] args) {

        // Nur bei gleichzeitiger Deklaration erlaubt
        int[] arr1 = {10,25,33,17,19,0,-22}; // Array wird in passender Größe erzeugt

        // Ist die Variable bereits deklariert, verwendet man diese Schreibweise
        arr1 = new int[]{1,2,3,4};

        int[] arr2 = new int[10]; // Array mit Größe 10 gefüllt mit Standardwerten

        Arrays.fill(arr2, 100); // Befüllt alle Arrays-Positionen mit dem Wert 100

        System.out.println(arr1);
        System.out.println(arr2);

        // Arrays = Utility Klasse mit Hilfsmethode für Arrays

        String output = Arrays.toString(arr1);
        System.out.println(output);

        System.out.println(Arrays.toString(arr2));

        System.out.println();

        // Arrays beginnen mit dem Index 0

        // int i = 0 : wird beim Start der Schleife einmalig ausgeführt
        // i < ... : wird vor dem Rumpf ausgeführt
        // {...} : Rumpf Verarbeitung
        // i++ : Änderung des Zählers

        for(int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i] + ", ");
        }

        System.out.println();

        // arr1 : Sammlung
        // int zahl : Variable für den aktuellen Wert
        for(int zahl : arr1) {
            System.out.print(zahl + ", ");
        }

        System.out.println();

        System.out.println(arr1[0]); // 0 ist der Index
        arr1[0] = 27;
        System.out.println(arr1[0]);

        // ArrayIndexOutOfBoundsException: 3 ist der letzte Index in diesem Array
        //arr1[4] = 23;
        // ArrayIndexOutOfBoundsException: Index kann nicht negativ sein
        //arr1[-2] = 23;
        // NegativeArraySizeException: Größe des Arrays darf nicht negativ sein
        //arr1 = new int[-15];

        // Max Größe eines Arrays = Integer.MAX_VALUE

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

    }
}
