package de.lubowiecki.generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        TextBox box1 = new TextBox();
        box1.setContent("Hi Box");
        System.out.println(box1.getContent());

        ZahlenBox box2 = new ZahlenBox();
        box2.setContent(123);
        System.out.println(box2.getContent());

        System.out.println();

        Box<String> box3 = new Box<>();
        box3.setContent("Hi GenericBox");
        System.out.println(box3.getContent());

        Box<Integer> box4 = new Box<>();
        box4.setContent(125);
        System.out.println(box4.getContent());

        Box<LocalDate> box5 = new Box<>();
        box5.setContent(LocalDate.now());
        System.out.println(box5.getContent());

        System.out.println();

        //List<double> preise = new ArrayList<>(); // Generische Typen sind IMMMMMMMER komplex!!!!
        List<Double> preise = new ArrayList<>();
        preise.add(10.99);
        preise.add(15.99);
        preise.add(22.99);

        System.out.println(preise.get(1));

        System.out.println();

        // Raw-Type ist hier Object
        List werte = new ArrayList();
        werte.add(100); // int autoboxing zu Integer
        werte.add("Hallo Box");
        werte.add(LocalDate.now());

        for(Object o : werte) {
            System.out.println(o);
        }

        System.out.println();

        Manipulator<Byte> m1 = new Manipulator<>();
        m1.setContent((byte)100);
        System.out.println(m1.getContent());

        System.out.println();
        // Manipulator<String> m2 = new Manipulator<>(); // String ist mit Number nicht verwandt

    }
}

class TextBox {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class ZahlenBox {

    private int content;

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
}

class Box<T> { // T ist ein Platzhalter für einen Datentyp

    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

class Manipulator<T extends Number> { // T muss Number oder eine Kindklasse davon sein

    private T zahl;

    public double getContent() {
        return zahl.doubleValue() * zahl.doubleValue();
    }

    public void setContent(T content) {
        this.zahl = content;
    }
}