package src.main.java.Exercises1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//12. Multiply and sum list elements using lambda
//Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
public class Ex12 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5);
        System.out.println("Original list: " + list);

        Optional<Integer> sum = list.stream().reduce(Integer::sum);
        System.out.println("Sum of the list of elements: " + sum.orElse(null));

        Integer rez = list.stream().reduce(1, (x, y) -> x * y);
        System.out.println("Product of the list elements: " + rez);
    }
}
