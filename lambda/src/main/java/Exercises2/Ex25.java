package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//25. Chain multiple Predicates to check complex condition
//Check whether a number is both positive and even using Predicate.and().
public class Ex25 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        version1(list);
        version2(list);
    }

    private static void version1(List<Integer> list) {
        list.stream()
            .filter(n -> n > 0) // check if is positive
            .filter(n -> n % 2 == 0) // check if is even
            .forEach(System.out::println);
    }

    private static void version2(List<Integer> list) {
        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;
        list.stream()
            .filter(isPositive.and(isEven))
            .forEach(System.out::println);
    }
}