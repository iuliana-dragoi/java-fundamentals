package src.main.java.Exercises2;

import java.util.function.Predicate;

//17. Check if a string contains only digits using Predicate<String>
//Check if a string contains only digits (Character.isDigit).
public class Ex17 {

    public static void main(String[] args) {
        String string = "12345";
        Predicate<String> containsOnlyDigitsV1 = (s) -> {
            char[] characters = s.toCharArray();
            for (char character : characters) {
                if (!Character.isDigit(character)) return false;
            }
            return true;
        };

        Predicate<String> containsOnlyDigitsV2 = (s) -> s.chars().allMatch(Character::isDigit);

        System.out.println(containsOnlyDigitsV1.test(string));
        System.out.println(containsOnlyDigitsV2.test(string));
    }
}
