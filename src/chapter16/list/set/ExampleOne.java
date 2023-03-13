package chapter16.list.set;

import java.util.HashSet;
import java.util.Set;

public class ExampleOne {
    public static void main(String[] args) {
        Set<String> states = new HashSet<>();
        states.add("Abia");
        states.add("Bauchi");
        states.add("Ogun");
        states.add("Lagos");
        states.add("Osun");

        System.out.println("states:: "+states);
        System.out.println(states.size());
    }

}
