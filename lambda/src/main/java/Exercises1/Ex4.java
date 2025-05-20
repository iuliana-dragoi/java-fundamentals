package src.main.java.Exercises1;

import java.util.Arrays;
import java.util.List;

//4. Filter even and odd numbers with lambda
//Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
public class Ex4 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original List " + list);

        List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println("Even list: " + evenList);

        List<Integer> oddList = list.stream().filter(x -> x % 2 == 1).toList();
        System.out.println("Odd list: " + oddList);
    }
}
