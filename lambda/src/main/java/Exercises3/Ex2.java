package src.main.java.Exercises3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//2.Transform a list of sentences into a list of lengths of unique words.
//Use a Function<String, List<Integer>> that receives a sentence (e.g., "Ana are mere") and returns a list of lengths of each unique word. Collect all resulting lists into one using flatMap.
public class Ex2 {

    public static void main(String[] args) {

        List<String> sentences = Arrays.asList("Ana has a computer", "Ana has apples");
        Function<String, List<Integer>> function = (sentence) -> Arrays.stream(sentence.split(" ")).distinct().map(String::length).toList();
        List<Integer> result = sentences.stream().map(function).flatMap(List::stream).toList();
        System.out.println(result);
    }
}
