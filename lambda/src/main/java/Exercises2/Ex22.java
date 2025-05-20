package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.List;

//22. Get first element that matches condition using filter().findFirst()
//Find the first name that starts with "M".
public class Ex22 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "aam", "maa", "Mama");
        String result = list.stream().filter(s -> s.startsWith("M")).findFirst().orElse(null);
        System.out.println(result);
    }
}
