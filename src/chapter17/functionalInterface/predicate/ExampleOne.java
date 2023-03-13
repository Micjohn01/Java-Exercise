package chapter17.functionalInterface.predicate;

import java.util.function.Predicate;

public class ExampleOne {
    public static void main(String[] args) {
        Predicate<String> predicate = (word)->word.length()>3;
//        in a One Liner lambda expression, you don't need the curly braces and the keyword "return"
        System.out.println(predicate.test("Semicolon"));
    }
}
