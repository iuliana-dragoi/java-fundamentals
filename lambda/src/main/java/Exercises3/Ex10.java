package src.main.java.Exercises3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//10.Sort a HashMap by its values in descending order and collect to a LinkedHashMap.
//Given a HashMap, sort its entries by value descending using lambdas and streams, then collect the sorted entries into a LinkedHashMap to preserve order.
public class Ex10 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 40);
        map.put("banana", 10);
        map.put("orange", 50);
        map.put("kiwi", 30);

        LinkedHashMap<String, Integer> sorted = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        )
                );
        sorted.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
