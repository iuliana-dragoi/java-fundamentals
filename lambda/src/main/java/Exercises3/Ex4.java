package src.main.java.Exercises3;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

//4.Generate 20 random numbers between 1 and 100 and keep only those that are even and divisible by 5.
//Use a Supplier<Integer> with Stream.generate(). Apply a Predicate<Integer> to filter the numbers and collect the result into a list.
public class Ex4 {

    public static void main(String[] args) {
        Supplier<Integer> generate = () -> new Random().nextInt(1, 100);
        List<Integer> result = Stream.generate(generate)
                .limit(20)
                .filter(number -> number % 2 == 0)
                .filter(number -> number % 5 == 0)
                .toList();
        System.out.println(result);
    }
}
