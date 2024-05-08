package de.lubowiecki.designpatterns.composite;

public class CompositeTest {

    public static void main(String[] args) {

        Kreis k1 = new Kreis(10, 15, 100);
        System.out.println(k1);
        k1.bewegeAn(25, 25);
        System.out.println(k1);

        Rechteck r1 = new Rechteck(10, 15, 50, 150);
        System.out.println(r1);
        r1.bewegeAn(25, 25);
        System.out.println(r1);

        Rechteck r2 = new Rechteck(7, -2, 20, 80);
        System.out.println(r1);

        //GeoForm gf = new GeoForm(); // Kann nicht istanziert werden, da abstract
        //gf.setX(10);
        //gf.setY(-20);

        System.out.println();

        Gruppe gr = new Gruppe();
        gr.add(k1, r1, r2);
        gr.bewegeAn(200, 200);
        System.out.println(gr);
        gr.bewegeAn(20, 25);
        System.out.println(gr);
        gr.bewegeAn(100, 100);
        System.out.println(gr);

        Gruppe gr2 = new Gruppe();
        gr2.add(new Kreis(5, 5, 200));
        gr2.add(new Rechteck(1, 2, 25, 100));

        System.out.println();

        gr.add(gr2);
        gr.bewegeAn(300, 320);
        System.out.println(gr);

    }
}
