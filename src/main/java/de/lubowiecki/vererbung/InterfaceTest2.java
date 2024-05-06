package de.lubowiecki.vererbung;

public class InterfaceTest2 {

    public static void main(String[] args) {

        //I1 c = new C2();
        C1 c = new C2();
        c.machWas();


    }

}

interface I1 {

    void machWas();

}

interface I2 {

    void machWasAnderes();

}

interface I3 extends I1, I2 {

    double PI = 3.14; // public static final

}

abstract class C1 implements I1 { // Methode des Interface muss implementiert werden, oder die Klasse muss abstact sein

    void machWasGanzAnderes() {
        //...
    }

    abstract void machWasGanzAnderes(int zahl);

}

class C2 extends C1 {

    @Override
    public void machWas() {
        System.out.println("...");
    }


    @Override
    void machWasGanzAnderes(int zahl) {
        System.out.println(zahl);
    }
}

class C3 implements I3 {

    @Override
    public void machWas() {
        System.out.println(I3.PI);
    }

    @Override
    public void machWasAnderes() {

    }
}