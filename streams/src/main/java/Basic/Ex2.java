package main.java.Basic;

import java.util.List;
import java.util.function.Function;

public class Ex2 {

    public static void main(String[] args) {
        List<String> names = List.of("John", "Mary", "Jane");
        Function<String, String> convertToUppercase = (name) -> name.toUpperCase();
        List<String> convertedList = names.stream().map(convertToUppercase).toList();
        System.out.println(convertedList);
    }
}
