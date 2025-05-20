package src.main.java.Exercises1;

import java.util.Arrays;
import java.util.List;

//17. Find longest and shortest string using lambda
//Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
public class Ex17 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("word1", "word22", "word333", "word4444");

        int max = list.stream().mapToInt(String::length).max().orElse(0);
        System.out.println("Max=" + max);

        int min = list.stream().mapToInt(String::length).min().orElse(0);
        System.out.println("Min=" + min);
    }
}
