package src.main.java.Exercises3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

//5.Given a list of sentences, return the longest sentence that contains a certain keyword (e.g., "Java").
//Create a Predicate<String> that tests if the sentence contains "Java" and use max(Comparator.comparingInt(String::length)) to find the longest matching sentence.
public class Ex5 {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Java", "This iss Java", "Test 12 34 this Java is good");
        Predicate<String> longestSentence = sentence -> sentence.contains("Java");
        String result = sentences.stream().filter(longestSentence).max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(result);

        String result2 = sentences.stream().filter(s -> s.contains("Java")).max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(result2);
    }
}
