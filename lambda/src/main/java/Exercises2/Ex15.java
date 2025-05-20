package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//15. Print the length of each string using Consumer
//Use forEach() with a Consumer that prints the length of each string.
public class Ex15 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "bbbbb", "ccccccccc");
        Consumer<String> c = (s) -> System.out.println(s.length());
        list.forEach(c);
    }
}
