package src.main.java.Exercises2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//11. Square each number and collect into list using Function + map()
//Transform each number in a list into its square using map() and Function.
public class Ex11 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Function<Integer, Integer> f = (a) -> a * a;
        List<Integer> result = list.stream().map(f).toList();
        System.out.println(result);
    }
}
