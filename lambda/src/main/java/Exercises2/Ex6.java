package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//6. Greet a list of names using Consumer<String>
//Use a Consumer that takes a name and displays a greeting.
public class Ex6 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mary", "John", "Jane");
        Consumer<String> consumer = s -> System.out.println("Hello " + s);
        names.forEach(consumer);
    }
}