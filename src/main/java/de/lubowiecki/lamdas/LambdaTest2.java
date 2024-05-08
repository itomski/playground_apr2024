package de.lubowiecki.lamdas;

public class LambdaTest2 {

    public static void main(String[] args) {

        // Jedes Lambda basiert in Java auf einem Functional-Interface

        /*
        // in JavaScript
        meineFunktion(function() {
            //...
        });
        */

        MathOperation multi1 = new Multi();
        System.out.println(multi1.exec(10, 15));

        // double exec(double a, double b);
        MathOperation multi2 = (x , y) -> x * y; // Implementierung der exec Methode
        System.out.println(multi2.exec(10, 15));

        System.out.println();

        runOp((a, b) -> a / b, 100, 10);
        runOp((a, b) -> a * a + b * b, 100, 10);
        runOp((a, b) -> b - a, 100, 10);
        runOp(multi2, 100, 10);
        //runOp((x) -> x * x, 100, 10); // Error: Zu wenig Parameter
        runOp((x, y) -> x * y, 100, 10);

        System.out.println();

        SomeOperation op1 = a -> a * a; // Bei einem Parameter kann () weggelassen werden
        SomeOperation op2 = (a) -> a / a;
        SomeOperation op3 = (double a) -> a + a; // der datentyp ist optional

        SomeOperation op4 = a -> {
            double sum = 0;
            sum += a;
            sum += a;
            sum += a;
            return sum;
        };

        System.out.println(op4.exec(1000));

    }

    public static void runOp(MathOperation op, double param1, double param2) {
        System.out.println(op.exec(param1, param2));
    }

}

// Functional-Interface

@FunctionalInterface // Prüft, ob Regeln für ein FunctionalInterface eingehalten wurden
interface MathOperation {

    // Muss ein SAM sein (Single Abstract Method)

    double exec(double a, double b);

    //double exec(double a); // FunctionalInterface darf nur eine abstrakte Methode haben

}

class Multi implements MathOperation {

    @Override
    public double exec(double x, double y) {
        return x * y;
    }
}

@FunctionalInterface
interface SomeOperation {

    double exec(double a);

}