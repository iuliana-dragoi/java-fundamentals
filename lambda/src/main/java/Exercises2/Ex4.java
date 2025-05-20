package src.main.java.Exercises2;

import java.util.function.BiFunction;

//4. Combine first and last names using BiFunction
//Use BiFunction<String, String, String> to combine first and last names into a full name.
public class Ex4 {

    public static void main(String[] args) {

        String firstName = "Dragoi";
        String lastName = "Iuliana";

        BiFunction<String, String, String> function = (s1, s2) -> s1 + " " + s2;
        System.out.println(function.apply(firstName, lastName));
    }
}
