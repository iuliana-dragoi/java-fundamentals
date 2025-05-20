package src.main.java.Exercises2;

import java.util.Random;
import java.util.function.Supplier;

//7. Supply a random number using Supplier<Integer>
//Create a Supplier that returns a random number between 1 and 100.
public class Ex7 {

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt(1, 100);
        System.out.println(supplier.get());
    }
}
