package chapter17.functionalInterface.function;

import java.util.function.Function;

public class ExampleOne {
    public static void main(String[] args) {
        Function<String, Integer> function = (name)->name.length();
        System.out.println(function.apply("Michael"));
    }
}
