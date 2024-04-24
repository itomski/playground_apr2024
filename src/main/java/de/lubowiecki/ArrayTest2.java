package de.lubowiecki;

import java.util.UUID;

public class ArrayTest2 {

    public static void main(String[] args) {

        double a, b, c; // Deklariert 3 Variablen gleichen typs
        int a2 = 1, b2 = 7, c2; // Deklariert inkl. Initialisierung

        int[] a3, b3, c3; // Deklariert 3 Arrays-Variablen gleichen typs
        int a4, b4[], c4; // Deklariert 2 int Variablen und eine Array-Variable

        String[] namen = {"Peter", "Carol", "Natasha", "Tony", "Scott"}; // String-Array

        System.out.println();

        Person[] personen = new Person[10];
        personen[0] = new Person("Peter", "Parker");
        personen[1] = new Person("Carol", "Danvers");
        personen[2] = new Person("Natasha", "Romanov");
        personen[3] = new Person("Tony", "Stark");

        for(Person p : personen) {
            if(p != null) {
                System.out.println(p.getVorname() + " " + p.getNachname());
            }
        }

        double[] werte = {10, 15, 22, 18, -100, 235};
        System.out.println(getSum(werte));

        String[] strArr = getRandHash(2);
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);

    }

    static double getSum(double[] zahlen) { // Array als Parameter
        double sum = 0;
        for(double wert : zahlen) {
            sum += wert;
        }
        return sum;
    }

    static String[] getRandHash(int num) { // Array als Rückgabetyp
        String[] arr = new String[num];
        for (int i = 0; i < arr.length; i++) {
            // UUID sind Hash-Werte
            arr[i] = UUID.randomUUID().toString();
        }
        return arr;
    }
}
