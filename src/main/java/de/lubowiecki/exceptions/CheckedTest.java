package de.lubowiecki.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckedTest {

    public static void main(String[] args) {
        System.out.println("Start: main");
        try {
            new CheckedTest().machWas1();
        }
        catch(FileNotFoundException ex) {
            System.out.println();
        }
        System.out.println("Ende: main");
    }

    void machWas1() throws FileNotFoundException {
        System.out.println("Start: m1");
        machWas2();
        System.out.println("Ende: m1");
    };

    void machWas2() throws FileNotFoundException {
        System.out.println("Start: m2");
        machWas3();
        System.out.println("Ende: m2");
    };
    void machWas3() throws FileNotFoundException{ // throws verpflichtet den Aufrufer dieser Methode zur Behandlung
        System.out.println("Start: m3");
        machWas4();
        System.out.println("Ende: m3");
    };

    void machWas4() throws FileNotFoundException { // Exception wird automatisch an den Aufrufer der Methode weitergegeben
        System.out.println("Start: m4");
        InputStream in = new FileInputStream("data.txt");
        System.out.println("Ende: m4");
    };

}
