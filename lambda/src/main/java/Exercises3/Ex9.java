package src.main.java.Exercises3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//9.Filter a HashMap to keep only entries with values greater than 50. Given a HashMap,
//filter it to retain only entries where the value is greater than 50. Use streams and lambdas to produce a new filtered map.
public class Ex9 {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);
        map.put(4, 50);
        map.put(5, 51);
        map.put(6, 52);

        Map<Integer, Integer> filtered = map.entrySet().stream()
                 .filter(entry -> entry.getValue() > 50)
                 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        filtered.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
