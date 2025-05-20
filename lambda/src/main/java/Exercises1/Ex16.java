package src.main.java.Exercises1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//16. Check if word exists in list using lambda
//Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
public class Ex16 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("word1", "word2", "word3", "word4", "word5");
        String search = "word2";

        Predicate<String> containsWord = word -> word.equals(search);
        boolean searchResult = list.stream().anyMatch(containsWord);
        System.out.println(searchResult);
    }
}
