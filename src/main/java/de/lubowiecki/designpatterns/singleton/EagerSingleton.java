package de.lubowiecki.designpatterns.singleton;

import java.util.Scanner;

public class EagerSingleton {

    private Scanner scanner = new Scanner(System.in);

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public Scanner getScanner() {
        return scanner;
    }
}
