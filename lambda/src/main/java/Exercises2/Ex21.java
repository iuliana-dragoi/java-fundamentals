package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.List;

//21. Check if all strings are lowercase using allMatch()
//Verify whether all elements in a list are in lowercase.
public class Ex21 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "D");
        boolean result1 = list.stream().allMatch(e -> e.toLowerCase().equals(e));
        boolean result2 = list.stream().allMatch(s -> s.chars().allMatch(Character::isLowerCase));

        System.out.println(result1);
        System.out.println(result2);
    }
}
