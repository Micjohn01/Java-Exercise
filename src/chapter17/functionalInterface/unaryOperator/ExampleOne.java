package chapter17.functionalInterface.unaryOperator;

import java.util.function.UnaryOperator;

public class ExampleOne {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (animal)->String.valueOf(animal.length());
        System.out.println(unaryOperator.apply("Wolf"));
    }
}
