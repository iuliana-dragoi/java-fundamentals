package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.List;

//18. Convert list of numbers to list of strings using map()
//Convert a List<Integer> into a List<String>.
public class Ex18 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> result = list.stream().map(Object::toString).toList();
        System.out.println(result);
    }
}
