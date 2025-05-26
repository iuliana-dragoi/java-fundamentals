package main.java.Basic;

import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = (number) -> number % 2 ==0;
        List<Integer> filtered = list.stream().filter(isEven).toList();
        System.out.println(filtered);
    }
}
