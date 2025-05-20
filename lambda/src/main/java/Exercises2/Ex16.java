package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.List;

//16. Concatenate a prefix to each string using map()
//Add the prefix "Item: " to each string in a list.
public class Ex16 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        List<String> result = list.stream().map(s -> "Item: " + s).toList();
        System.out.println(result);
    }
}
