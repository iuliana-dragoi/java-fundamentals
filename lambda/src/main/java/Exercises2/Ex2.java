package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//2. Convert list of strings to uppercase using Function
//Use Function<String, String> to convert a list of strings to uppercase.
public class Ex2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("test1", "test2", "test3");
        Function<String, String> convertToUpperCase = String::toUpperCase;

        List<String> convertedList = list.stream().map(convertToUpperCase).toList();
        System.out.println(convertedList);

        List<String> convertedList2 = list.stream().map(String::toUpperCase).toList();
        System.out.println(convertedList2);
    }
}
