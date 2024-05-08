package de.lubowiecki.designpatterns.singleton;

import java.util.Scanner;

public class LazySingleton {

    private Scanner scanner = new Scanner(System.in);

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if(instance == null) {
            // Threadsavety einbauen
            instance = new LazySingleton();
        }
        return instance;
    }

    public Scanner getScanner() {
        return scanner;
    }

}
