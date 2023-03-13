package chapter16.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ExampleFive {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("numbers:: "+numbers);

        List<Integer> list = new Vector<>();
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(20);

        System.out.println(numbers.containsAll(list));
        System.out.println("elememts at index 2 of list:: "+list.get(2));
    }
}
