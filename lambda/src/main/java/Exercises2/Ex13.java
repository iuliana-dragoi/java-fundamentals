package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//13. Find the longest string using Comparator and lambda
//Find the longest string in a list.
public class Ex13 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("test1", "test22", "test333", "test4444", "test555555");
        Optional<String> max = list
            .stream() // Create a stream of strings
            .max(Comparator.comparing(String::length)); // Finds the max element from stream according to a rule
            // Rule: Creates a comparator which compares strings based on their length
        System.out.println(max.get());
    }
}
