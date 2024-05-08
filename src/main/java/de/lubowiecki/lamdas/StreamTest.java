package de.lubowiecki.lamdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamTest {

    public static void main(String[] args) {


        try {
            /*
            List<String> zeilen = Files.readAllLines(Paths.get("data.txt"));
            for(String zeile : zeilen) {
                System.out.println(zeile);
            }
            */

            Files.lines(Paths.get("data.txt"))
                    .filter(zeile -> !zeile.startsWith("Als"))
                    .map(zeile -> zeile.toUpperCase())
                    .limit(5)
                    .forEach(zeile -> System.out.println(zeile));

            System.out.println();

            Random rand = new Random();

            // Stream von primitiven ints
            IntStream.generate(() -> rand.nextInt(100) + 1) // Supplier
                    //.parallel() // Verarbeitung erfolgt mit mehreren Threads
                    .forEach(r -> System.out.println(Thread.currentThread().getName() + ":" + r));



        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
