package chapter16.list;

import java.util.*;

public class ExampleEight {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);

        System.out.println("Before removal-> " + numbers);

        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);

        numbers.removeAll(set);
        System.out.println("numbers after removal-> " + numbers);
    }
    }
