package de.lubowiecki;

import java.util.Arrays;

public class ArrayTest3 {

    public static void main(String[] args) {

        char[][] zeichen = {
                {'a', 'b'}, // 0
                {'x'}, // 1
                {'1', '@', '*', '&'} // 2
        };

        System.out.println(zeichen[2][3]);
        System.out.println(Arrays.toString(zeichen[0]));

        System.out.println();

        for (int row = 0; row < zeichen.length ; row++) {
            for (int col = 0; col < zeichen[row].length ; col++) {
                System.out.print(zeichen[row][col] + ", ");
            }
            System.out.println();
        }

        System.out.println();

        for (char[] row : zeichen) {
            for (char col : row) {
                System.out.print(col + ", ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] zahlen = new int[5][6];

        zahlen[3][2] = 1;

        for (int[] row : zahlen) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        zahlen = new int[2][]; // {null, null}
        zahlen[0] = new int[3]; // {{0,0,0}, null}
        zahlen[1] = new int[1]; // {{0,0,0}, {0}}

        int _x = 100;
        //int _ = 200; // alleine: Nicht mehr erlaubt
    }
}
