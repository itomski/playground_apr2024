package de.lubowiecki.lamdas;

import de.lubowiecki.oop.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class FunctionalInterfaceTest2 {

    public static void main(String[] args) {

        Person person1 = new Person("Peter", "Parker", null);

        Function<Person, String> func1 = p -> p.getVorname() + " " + p.getNachname();
        Function<Person, String> func2 = p -> p.getNachname() + ", " + p.getVorname();

        System.out.println(func1.apply(person1));
        System.out.println(func2.apply(person1));

        Function<String, LocalDate> parseDeDate = str -> {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            return LocalDate.parse(str, fmt);
        };

        System.out.println(parseDeDate.apply("25.02.1999"));
        System.out.println(parseDeDate.apply("17.11.2000"));
        System.out.println(parseDeDate.apply("28.09.1899"));

    }
}
