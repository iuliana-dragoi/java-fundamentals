package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//9. Remove null or empty strings using lambda
//Filter a list of strings by removing those that are null or empty.
public class Ex9 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("test", null, "", "test2");
        List<String> cleanList = list.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isBlank())
                .toList();
        System.out.println(cleanList);
    }
}
