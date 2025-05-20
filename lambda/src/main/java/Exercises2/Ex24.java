package src.main.java.Exercises2;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

//24. Build a list of random numbers using Supplier and Stream.generate()
//Create a list of 10 random numbers between 0 and 50.
public class Ex24 {

    public static void main(String[] args) {
        Supplier<Integer> generateRandomNumber = () -> new Random().nextInt(0, 50);
        List<Integer> list = Stream.generate(generateRandomNumber).limit(10).toList();
        System.out.println(list);
    }
}
