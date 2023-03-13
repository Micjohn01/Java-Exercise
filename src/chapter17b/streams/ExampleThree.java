package chapter17b.streams;

import java.util.stream.IntStream;

public class ExampleThree {
    public static void main(String[] args) {
        IntStream numbers = IntStream.rangeClosed(2,20);
//        numbers.forEach((num)-> System.out.println(num));
        int total = numbers.filter((num)->num%2==0).sum();
        System.out.println(total);
    }
}
