package de.lubowiecki.designpatterns.singleton;

import java.util.Scanner;

public class InputUtil {

    private InputUtil() {
    }

    public static void doSomethingElse() {

        Scanner scanner = EagerSingleton.getInstance().getScanner();
        System.out.print("Eingabe: ");
        String eingabe = scanner.nextLine();
    }
}
