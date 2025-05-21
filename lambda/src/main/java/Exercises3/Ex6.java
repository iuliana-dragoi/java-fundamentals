package src.main.java.Exercises3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//6.Count the frequency of each word in a list of strings using HashMap and lambdas. Given a list of words, use a HashMap to count how many times each word appears.
//Use lambda expressions and stream operations to update the counts.
public class Ex6 {

    public static void main(String[] args) {

        List<String> words = List.of("ana", "ana", "mere", "ana", "pere", "ana", "mere");
        Map<String, Integer> map = new HashMap<>();

        words.forEach(word -> {
            map.merge(word, 1, Integer::sum);
        });
        System.out.println(map);

        Map<String, Long> map2 = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map2);
    }
}
