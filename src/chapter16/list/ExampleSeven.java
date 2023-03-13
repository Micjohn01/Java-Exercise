package chapter16.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class ExampleSeven {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);

        Spliterator<Integer> numberSpliterator = numbers.spliterator();

        System.out.println("number:: "+numbers);
        var spliterator = numberSpliterator.trySplit();
//        System.out.println(spliterator.estimateSize());
        spliterator.forEachRemaining(System.out::println);


    }
}