package chapter16.list;

import java.util.*;

public class ExampleNine {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);

        System.out.println("Before sorting:: "+numbers);

        numbers.sort(Comparator.naturalOrder());
        System.out.println("After sorting:: "+numbers);
    }
}
