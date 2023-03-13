package chapter16.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleSix {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);

        System.out.println("index of element 3 in numbers-> " + numbers.indexOf(3));
        System.out.println("last index of element 3 in numbers-> " + numbers.lastIndexOf(3));

        Iterator<Integer> numberIterator = numbers.iterator();

        while (numberIterator.hasNext()) {
            System.out.println(numberIterator.next());
            numberIterator.remove();
            System.out.println(numbers);
        }
    }
}
