package de.lubowiecki.designpatterns.singleton;

import java.util.Scanner;

public class SingletonTest {

    public static void main(String[] args) {

        //Scanner scanner = EagerSingleton.getInstance().getScanner();
        Scanner scanner = LazySingleton.getInstance().getScanner();

        System.out.print("Eingabe: ");
        String eingabe = scanner.nextLine();

        doSomething();

    }

    static void doSomething() {

        Scanner scanner = EagerSingleton.getInstance().getScanner();

        System.out.print("Eingabe: ");
        String eingabe = scanner.nextLine();

        InputUtil.doSomethingElse();

    }
}
