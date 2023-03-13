package chapter16.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ExampleTwo {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
