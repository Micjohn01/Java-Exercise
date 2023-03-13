package chapter17b.streams;

import java.util.List;

public class ExampleEight {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(number.stream().count());
    }
}
