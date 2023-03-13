package chapter16.list.queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExampleTwo {
    public static void main(String[] args) {
        Queue<String> fillingStation = new PriorityQueue<>(Comparator.naturalOrder());
        fillingStation.offer("Ferrari");
        fillingStation.offer("Rolls Royce");
        fillingStation.offer("Porsche");
        fillingStation.offer("Accord");

        System.out.println(fillingStation);
        Iterator<String> iterator = fillingStation.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}