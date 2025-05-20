package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

//12. Sum all elements using reduce() and lambda
//Sum all values in a list of Integer using reduce().
public class Ex12 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        BinaryOperator<Integer> sum = Integer::sum;

        Integer result = list.stream().reduce(0, sum);
        System.out.println(result);
    }
}
