package chapter17b.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ExampleOne {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        numbers.stream().forEach((num)->System.out.println(num));

//        "TODO The method below is what happens under the hood from a stream"
//        Stream<Integer> stream = numbers.stream();
//        Consumer<Integer> consumer =
//                (number)-> System.out.println(number);
//        stream.forEach(consumer);
    }
}
