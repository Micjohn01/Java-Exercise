package chapter16.list.maps;

import java.util.HashMap;
import java.util.Map;

public class ExampleTwo {
    public static void main(String[] args) {
        Map<String, Integer> calendar = Map.of(
                "January", 18,
                "February",14,
                "March", 23,
                "April", 27,
                "May", 13
        );

        System.out.println(calendar);


    }
}