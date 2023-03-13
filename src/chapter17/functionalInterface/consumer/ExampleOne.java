package chapter17.functionalInterface.consumer;

import java.util.function.Consumer;

public class ExampleOne {
    public static void main(String[] args) {
        Consumer<Integer> consumer =
                (number) -> System.out.println("number passed to accept:: "+number);
        consumer.accept(5);
    }
}
