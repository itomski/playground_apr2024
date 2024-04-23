package de.lubowiecki;

import java.util.Random;

public class RandomNumsTest {

    public static void main(String[] args) {

        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        System.out.println((int)(Math.random() * 10) + 1);

        int randNum = (int)(Math.random() * 10) + 1;
        System.out.println(randNum);

        System.out.println();

        Random randGen = new Random();
        System.out.println(randGen.nextInt());
        System.out.println(randGen.nextDouble());
        System.out.println(randGen.nextInt(10) + 1);
        System.out.println(randGen.nextInt(100) + 1);
        System.out.println(randGen.nextInt(6) + 1);
    }
}
