package de.lubowiecki;

import java.util.Scanner;

public class UserInput {

    // final = Konstante = Variable darf nicht neu zugewiesen werden
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) { // Endlosschleife
            System.out.print("Gibt bitte eine Zahl ein: ");
            int input = scanner.nextInt(); // liest eine Ganzzahl ein
            //scanner.next(); // liest ein Wort ein (zus zum ersten Leerzeichen)
            //scanner.nextLine(); // liest eine Zeile ein

            //scanner = null;

            System.out.println("Deine Eingabe: " + input);

            if(input == 0) {
                break; // bricht die Schleife ab
            }
        }

        System.out.println("PROGRAMM WIRD BEENDET");

    }


}
