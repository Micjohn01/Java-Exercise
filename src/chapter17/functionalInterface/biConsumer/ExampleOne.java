package chapter17.functionalInterface.biConsumer;

import java.util.function.BiConsumer;

public class ExampleOne {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer =
                (String name, Integer age) -> {
                    System.out.println(name + " is" + age + "years old");
                };
        biConsumer.accept("Promise", 18);
//      The type is not compulsory
    }
}
