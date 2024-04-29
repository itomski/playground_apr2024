package de.lubowiecki;

public class OverloadingTest {

    public static void main(String[] args) {

        byte b1 = 123;
        byte b2 = 122;
        byte b3 = 100;
        doSomething(b1);
        doSomething();
        doSomething(b2, b3, b1);

        // Überladen: Parameterliste der Methoden muss sich unterscheiden

        // 1. Passende Methode
        // 2. primitive widening
                // byte < short < int < long < float < double
                //         char <
        // 3. Autoboxing (Wechsel von primitiv auf komplex)
        // 4. komplex widening
        // 5. VarArgs
        // 6. VarArgs (primitive widening)
        // 7. VarArgs (Autoboxiung)
        // 8. VarArgs (komplex widening)
        // 9. Kompiler ERROR

        System.out.println();

    }

    /*
    public static void doSomething(byte v) {
        System.out.println("byte");
    }
    */

    /*
    public static void doSomething(short v) {
        System.out.println("short");
    }
    */

    /*
    public static void doSomething(int v) {
        System.out.println("int");
    }
    */

    /*
    public static void doSomething(double v) {
        System.out.println("double");
    }
    */

    /*
    public static void doSomething(Byte v) { // Wrapper
        System.out.println("Byte");
    }
    */

    public static void doSomething(Integer v) { // Wrapper
        System.out.println("Integer");
    }

    /*
    public static void doSomething(Number v) { // Wrapper
        System.out.println("Number");
    }
    */

    public static void doSomething(byte... v) { // VarArgs
        System.out.println("\nbyte VarArg");
        for (byte b : v) {
            System.out.print(b + ", ");
        }
    }
}
