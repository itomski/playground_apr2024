package de.lubowiecki.lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatTest {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>(List.of(5,17,22,8,-12,100,22,18,9,2,99,17));

        /*
        for(Integer i : zahlen) {
            if(i < 20) {
                zahlen.remove(i);
            }
        }
        */

        /*
        for(int i = 0; i < zahlen.size(); i++) {
            int zahl = zahlen.get(i);
            if(zahl < 20) {
                zahlen.remove(i);
            }
        }
        */

        //Predicate<Integer> kleinerAls20 = z -> z < 20;
        //zahlen.removeIf(kleinerAls20);
        zahlen.removeIf(z -> z < 20); // Elemente bei denen das Predicate true ergibt werden entfernt

        System.out.println(zahlen);


    }
}
