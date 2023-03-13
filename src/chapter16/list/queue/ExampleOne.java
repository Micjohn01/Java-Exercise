package chapter16.list.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExampleOne {
    public static void main(String[] args) {
        Queue<String> fillingStation = new PriorityQueue<>(Comparator.naturalOrder());
        fillingStation.offer("Ferrari");
        fillingStation.offer("Rolls Royce");
        fillingStation.offer("Porsche");
        fillingStation.offer("Accord");

//        System.out.println(fillingStation.peek());
        System.out.println(fillingStation);
    }
}
