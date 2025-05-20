package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

//3. Multiply numbers by 10 using UnaryOperator
//Apply a lambda that multiplies each number in the list by 10.
public class Ex3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        UnaryOperator<Integer> f = x -> x * 10;
        list.stream().map(f).forEach(System.out::println);

        exampleWithBinaryOperator(list);
    }

    public static void exampleWithBinaryOperator(List<Integer> list) {
        BinaryOperator<Integer> f2 = Integer::sum;
        Integer rez = list.stream().reduce(0, f2);
//        reduce -> combines all the elements of a string in one value.
//        0 is the initial value
//        a = 0 (initial value), b = 1 → 0 + 1 = 1
//        a = 1, b = 2 → 1 + 2 = 3
//        a = 3, b = 3 → 3 + 3 = 6
//        a = 6, b = 4 → 6 + 4 = 10
        System.out.println(rez);
    }
}
