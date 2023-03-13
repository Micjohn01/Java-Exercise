package chapter17b.streams;

import java.util.stream.IntStream;

public class ExampleFour {
    public static void main(String[] args) {

        int total = IntStream.rangeClosed(2,20) //TODO: [2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
                .filter((num)->num%2==0) //TODO: [2,4,6,8,10,12,14,16,18,20]
                .map((number)->number*number) //TODO: [4,8,36,64,100,144,196,256,324,400]
                .sum();
        System.out.println(total);
    }
}
