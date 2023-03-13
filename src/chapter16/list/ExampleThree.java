package chapter16.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ExampleThree {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        int minimum = Collections.min(numbers);
        System.out.println("largest " +Collections.max(numbers));
        System.out.println("smallest " +Collections.min(numbers));

        Collection<Integer> numbersTwo = new ArrayList<>();
        numbersTwo.add(1);
        numbersTwo.add(2);
        numbersTwo.add(3);

        System.out.println("elements in list numbers:: " +numbers);
        System.out.println("elements in list numbersTwo:: " +numbersTwo);
        System.out.println("adding elements of numbersTwo to numbers");
        boolean result = numbers.addAll(numbersTwo);
//        numbers.clear();

        System.out.println("element is:: "+result);
        System.out.println("numbers:: "+numbers);

        Iterator<Integer> numberIterator = numbers.iterator();

        while (numberIterator.hasNext()) {
            System.out.println(numberIterator.next());
        }
    }
}
