package chapter16.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExampleOne {
    public static void main(String[] args) {
//        List<String> words = new Stack<>();
//        words.add("What");
//        words.add("a");
//        words.add("beautiful");
//        words.add("day");
//        System.out.println(words);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        int number = numbers.get(2);
        System.out.println(number);
        System.out.println(numbers);
    }
}
