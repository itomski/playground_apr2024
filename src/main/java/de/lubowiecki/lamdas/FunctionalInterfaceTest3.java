package de.lubowiecki.lamdas;

import java.util.function.BinaryOperator;

public class FunctionalInterfaceTest3 {

    public static void main(String[] args) {

        BinaryOperator<Double> multi = (a, b) -> a * b;
        BinaryOperator<Double> div = (a, b) -> a / b;
        BinaryOperator<Double> add = (a, b) -> a + b;
        BinaryOperator<Double> sub = (a, b) -> a - b;

        System.out.println(multi.apply(10.0, 15.22));
        System.out.println(div.apply(10.0, 15.22));
        System.out.println(add.apply(10.0, 15.22));
        System.out.println(sub.apply(10.0, 15.22));

    }

}
