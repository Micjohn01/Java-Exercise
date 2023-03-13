package chapter16.list.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTwo {
    public static void main(String[] args) {
        Set<String> states = new TreeSet<>(Comparator.reverseOrder());
        states.add("Abia");
        states.add("Bauchi");
        states.add("Ogun");
        states.add("Lagos");
        states.add("Osun");

        System.out.println("states:: "+states);
    }

}
