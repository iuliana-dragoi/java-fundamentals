package src.main.java.Exercises1;

import java.util.Arrays;
import java.util.List;

//23. Find average string length using lambda
//Write a Java program to implement a lambda expression to find the average length of strings in a list.
public class Ex23 {

    public static void main(String[] args) {

        List<String> colors = Arrays.asList("Red", "Black", "White", "Orange", "Blue");
        System.out.println("Colors: " + colors);

        double result = colors.stream().mapToInt(s -> {
            System.out.println(s + " -> " + s.length());
            return s.length();
        }).average().orElse(0);

        System.out.println("--------------------");
        System.out.println("Average: " + result);
    }
}
