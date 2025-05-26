package main.java.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Consumer<String> display = (string) -> System.out.println(string);
        list.forEach(display);
    }
}
