package de.lubowiecki.lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest {

    public static void main(String[] args) {

        //List<String> namen = new ArrayList<>(Arrays.asList("Carol", "Peter", "Bruce", "Tony"));

        // Seit Java 1.9
        // List.of erzeugt eine Liste mit einer nicht veränderbaren Größe
        // List<String> namen = List.of("Carol", "Peter", "Bruce", "Tony");

        List<String> namen = new ArrayList<>(List.of("Carol", "Peter", "Bruce", "Tony"));

        for(String n : namen) {
            System.out.println(n);
        }

        System.out.println();

        // Seit Java 1.8
        namen.forEach(n -> System.out.println(n.toLowerCase()));

        // Lambdas sind Einweg-Inplementierungen von Interfaces

    }
}
