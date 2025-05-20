package src.main.java.Exercises1;

import java.util.Arrays;
import java.util.List;

//5. Sort strings alphabetically using lambda
//Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
public class Ex5 {

    public static void main(String[] args) {

        List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");
        System.out.println("Original list: " + colors);

//        colors.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
        colors.sort(String::compareToIgnoreCase);
        System.out.println("Sorted list: " + colors);

//        List sortedColors = colors.stream().sorted((s1, s2) -> s1.compareToIgnoreCase(s2)).toList();
        List sortedColors = colors.stream().sorted(String::compareToIgnoreCase).toList();
        System.out.println("Sorted list: " + sortedColors);
    }
}
