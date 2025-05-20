package src.main.java.Exercises2;

import java.util.function.BiPredicate;

//8. Check if two strings are equal (case-insensitive) using BiPredicate
//Compare two strings ignoring case sensitivity.
public class Ex8 {

    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = String::equalsIgnoreCase;
        boolean result = biPredicate.test("a", "A");
        System.out.println(result);
    }
}
