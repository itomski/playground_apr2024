package de.lubowiecki.oop;

public class ObjektbeziehungsTest {

    public static void main(String[] args) {

        // IS-A Beziehung wird durch vererbung beschrieben

        // d1 kann nur mit einem Double belegt werden
        Double d1 = Double.valueOf(10.0);

        // n1 kann mit Number und allen Kindklassen davon belegt werden
        Number n1 = Double.valueOf(10.0);
        n1 = Integer.valueOf(100);
        n1 = Byte.valueOf("10");

        // n1 kann alle Objekte aufnehmen, die in einer IS-A-Beziehung dazu stehen

        // Object > Number > Integer

        Object o1 = "Hallo"; // String IS-A Object
        o1 = 123; // int - Autoboxing zu Integer IS-A Object
        o1 = new Fahrzeug("HH:AB123"); // Fahrzeug IS-A Object
        // Über o1 können nur Methoden von Object genutzt werden
    }
}
