package chapter17b.streams;

import java.util.Random;
import java.util.stream.Stream;

public class ExampleTwo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 7, 8);
        stream.forEach(n-> System.out.println(n));

        Stream<Integer> emptyStream = Stream.empty();
        emptyStream.forEach(n-> System.out.println(n));
//        System.out.println("emptyStream = "+emptyStream);

//        Stream<Integer> number = Stream.generate(()->new Random().nextInt(10)).limit(8);
//        number.forEach((n-> System.out.println()));
    }
}
