package main.java;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckPalindrome {

    private static boolean  isPalindrome(String input) {

        Deque<Character> d = new ArrayDeque<>();
        for(Character c : input.toCharArray()) {
            if(!Character.isLetterOrDigit(c)) return false;
            d.add(Character.toLowerCase(c));
        }

        while (d.size() > 1) {
            Character first = d.removeFirst();
            Character last = d.removeLast();
            if(!first.equals(last)) return false;
            System.out.println(first + " = " + last + " ? " + first.equals(last));
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "racecar";
        boolean result = isPalindrome(input);
        System.out.println(input + " " + result);
    }
}
