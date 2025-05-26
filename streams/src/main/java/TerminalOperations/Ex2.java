package main.java.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Ex2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        Integer result1 = list.stream().reduce(0, sum);
        Integer result2 = list.stream().reduce(0, Integer::sum);

        System.out.println(result1);
        System.out.println(result2);
    }
}
