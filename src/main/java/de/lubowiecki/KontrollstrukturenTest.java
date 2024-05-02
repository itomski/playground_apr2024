package de.lubowiecki;

public class KontrollstrukturenTest {

    public static void main(String[] args) {

        // if / else-if / while / do-while und Bedingungen von for arbeiten nur mit boolean

        int zahl1 = 0;
        int zahl2 = 100;

        if(zahl2 < 100) {
            zahl1 = 1;
        }
        else {
            zahl1 = -1;
        }

        machWas(zahl1);


        zahl1 = (zahl2 < 100) ? 1 : -1;

        //machWas((zahl2 < 100) ? 1 : -1);

    }

    static void machWas(int z) {
        //...
    }

}
