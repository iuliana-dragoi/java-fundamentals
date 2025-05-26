package main.java.Basic;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex5 {

    public static void main(String[] args) {

        List<String> sentences = List.of(
            "Java streams are powerful",
            "Practice makes perfect",
            "Keep learning every day"
        );
        List<String> words = sentences.stream().flatMap(sentence -> {
            return Stream.of(sentence.split(" "));
        }).toList();
        System.out.println(words);

        List<Integer> wordLengths = words.stream().map(word -> {
            return word.length();
        }).toList();
        System.out.println(wordLengths);

        Map<Integer, List<String>> groupedByLength = sentences.stream()
                .flatMap(sentence -> Stream.of(sentence.split(" ")))
                .collect(Collectors.groupingBy(word -> word.length()));
        System.out.println(groupedByLength);
    }
}
