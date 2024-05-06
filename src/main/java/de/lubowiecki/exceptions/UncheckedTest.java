package de.lubowiecki.exceptions;

public class UncheckedTest {

    public static void main(String[] args) {
        System.out.println("Start: main");
        try {
            new UncheckedTest().machWas1();
        }
        catch(NullPointerException ex) {
            System.out.println("String ist NULL");
        }
        System.out.println("Ende: main");
    }

    void machWas1(){
        System.out.println("Start: m1");
        machWas2();
        System.out.println("Ende: m1");
    };
    void machWas2(){
        System.out.println("Start: m2");
        machWas3();
        System.out.println("Ende: m2");
    };
    void machWas3(){
        System.out.println("Start: m3");
        machWas4();
        System.out.println("Ende: m3");
    };

    void machWas4(){ // Exception wird automatisch an den Aufrufer der Methode weitergegeben
        System.out.println("Start: m4");
        String s = null;
        System.out.println(s.toLowerCase());
        System.out.println("Ende: m4");
    };

}
