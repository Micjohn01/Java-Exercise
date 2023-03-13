package chapter17.functionalInterface.binaryOperator;

import java.util.function.BinaryOperator;

public class ExampleOne {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (name, word)->name+word;
        System.out.println(binaryOperator.apply("Semicolon", "Native"));
    }
}
