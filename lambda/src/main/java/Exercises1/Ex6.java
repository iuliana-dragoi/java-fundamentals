package src.main.java.Exercises1;

import java.util.Arrays;
import java.util.List;

//6. Find average of doubles using lambda
//Write a Java program to implement a lambda expression to find the average of a list of doubles.
public class Ex6 {

    public static void main(String[] args) {

        List<Double> list = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);
        System.out.println("Original List: " + list);

        list.stream()                               // Stream<Double>
//                .mapToDouble(n -> n)
                .mapToDouble(Double::doubleValue)   // Transforms in DoubleStream (with method reference)
                .average()                          // Calculates the average
                .orElse(0.0);                 // Default returns 0.0 if list is empty
    }
}
