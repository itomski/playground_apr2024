package de.lubowiecki.lamdas;

import de.lubowiecki.oop.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {

        // void accept(T t);
        Consumer<String> cons1 = (s) -> System.out.println(s.substring(0, 5));
        Consumer<String> cons2 = (s) -> System.out.println(s.toLowerCase());

        cons1.accept("Das ist das Haus von Nikigraus");
        cons2.accept("Das ist das Haus von Nikigraus");

        System.out.println();

        // void accept(Person t);
        Consumer<Person> cons3 = p -> System.out.printf("| %10s | %10s | \n", p.getVorname(), p.getNachname());

        Consumer<Person> cons4 = p -> System.out.println(p.getVorname().charAt(0) + ". " + p.getNachname());

        Person person1 = new Person("Peter", "Parker", null);
        Person person2 = new Person("Bruce", "Banner", null);
        Person person3 = new Person("Carol", "Danvers", null);

        cons3.accept(person1);
        cons3.accept(person2);
        cons3.accept(person3);

        System.out.println();

        List<Person> personen = new ArrayList<>();
        personen.add(person1);
        personen.add(person2);
        personen.add(new Person("Natasha", "Romanov", null));
        personen.add(person3);

        //personen.forEach(cons3);
        personen.forEach(cons4);
    }

}
