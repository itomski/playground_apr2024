package de.lubowiecki.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionTest1 {

    public static void main(String[] args) {

        System.out.println("Start");

        // Unchecked Exception
        String input = null;
        // System.out.println(input.toLowerCase()); // NullPointerException

        //machWas();
        //machWasAnderes();

        try {
            System.out.println(booking(17));
        }
        catch(RuntimeException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Ende");
    }

    static void machWas() {
        int[] arr = new int[10];
        //int[] arr = new int[-10]; // NegativeArraySizeException
        arr[10] = 100; // ArrayIndexOutOfBoundsException
        //arr[-1] = 100; // ArrayIndexOutOfBoundsException
    }

    static void machWasAnderes() {

        // Checked Exception: handle - Promlem wird direkt hier behandelt. Der Aufrufer bekommt nichts mit
        try {
            InputStream in = new FileInputStream("xyz.txt"); // muss behandelt werden
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void machGanzWasAnderes() throws FileNotFoundException { // declare

        // throws = Aufrufer der Methode muss sich um die Behandlung der Exception selbst kümmern

        // Checked Exception: handle or declare
        InputStream in = new FileInputStream("xyz.txt"); // muss behandelt werden
    }

    static boolean booking(int alter) {

        if(alter < 15) {
            throw new RuntimeException("Du bist zu jung.");
        }
        else if(alter > 100) {
            throw new RuntimeException("Du bist zu alt.");
        }

        // Karte wird gebucht
        return true;
    }
}
