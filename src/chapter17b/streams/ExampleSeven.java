package chapter17b.streams;

import java.util.List;
import java.util.stream.Collectors;

public class ExampleSeven {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,22,3,44,2,4,3,12,3,6,7,5,1);
        System.out.println("Before:: "+number);
        System.out.println("After:: "+number.stream().distinct()
                .sorted()
                .collect(Collectors.toList()));
    }
}