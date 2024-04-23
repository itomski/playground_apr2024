package de.lubowiecki;

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("Bruce", "Banner");
        Person p3 = new Person();

        p3.setVorname("Peter");
        p3.setNachname("Parker");

        p1.setVorname("Carol");
        p1.setNachname("Danvers");

        p2 = null;

        //p1.setCount(1);
        //Person.setCount(1);
        //System.out.println(p3.getCount());
        System.out.println(Person.getCount());


    }
}
