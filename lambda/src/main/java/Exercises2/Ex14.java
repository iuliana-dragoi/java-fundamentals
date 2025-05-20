package src.main.java.Exercises2;

import java.util.function.Supplier;

//14. Generate a constant greeting using Supplier<String>
//Create a Supplier that always returns "Hello, world!".
public class Ex14 {

    public static void main(String[] args) {
        Supplier<String> greeting = () -> "Hello World";
        System.out.println(greeting.get());
    }
}
