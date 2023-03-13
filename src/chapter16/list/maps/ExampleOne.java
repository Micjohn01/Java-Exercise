package chapter16.list.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExampleOne {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Promise", 18);
        map.put("Precious", 16);
        map.put("Peace", 28);
//Any duplicate key replaces the value
        System.out.println(map);

        Integer promiseAge = map.get("Promise");
        System.out.println(promiseAge);

        System.out.println(map.containsValue(22));
        Set<String> keys = map.keySet();
        System.out.println(keys);

        int result = map.replace("Promise", 19);
        System.out.println(result);
        System.out.println(map);
    }
}
