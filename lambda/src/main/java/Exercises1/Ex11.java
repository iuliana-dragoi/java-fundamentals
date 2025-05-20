package src.main.java.Exercises1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//11. Find max and min in list using lambda
//Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
public class Ex11 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> max = list.stream().max(Integer::compare);
        System.out.println("Max: " + max.orElse(null));

        Optional<Integer> min = list.stream().min(Integer::compare);
        System.out.println("Min: " + min.orElse(null));
    }
}
