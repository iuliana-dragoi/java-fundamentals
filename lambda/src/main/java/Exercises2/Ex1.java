package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//1. Filter names starting with 'A' using Predicate
//Write a program that filters a list of names, keeping only those that start with the letter A.
public class Ex1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Michelle", "John", "Michael", "Robert", "Albert" );
        List<String> namesStartingWithA = list.stream()
            .filter(Objects::nonNull)
            .filter(string -> string.startsWith("A"))
            .toList();
        System.out.println(namesStartingWithA );
    }
}
