package src.main.java.Exercises1;

import java.util.function.Predicate;

//14. Check if string is palindrome using lambda
//Write a Java program to implement a lambda expression to check if a given string is a palindrome.
public class Ex14 {

    public static void main(String[] args) {

        Predicate<String> palindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString().toLowerCase();
            return str.toLowerCase().equals(reversed);
        };

        boolean test = palindrome.test("Madam");
        System.out.println(test);
    }
}
