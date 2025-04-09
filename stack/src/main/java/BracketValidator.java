package main.java;

import java.util.Stack;
import java.util.HashMap;

public class BracketValidator {

    public static boolean isValidExpression(String expression) { //]
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> matchingParen = new HashMap<>();
        matchingParen.put(')', '(');
        matchingParen.put(']', '[');
        matchingParen.put('}', '{');

        //stack = ([
        for (char c : expression.toCharArray()) {
            if (matchingParen.containsValue(c)) {
                stack.push(c);
            } else if (matchingParen.containsKey(c)) {

                if(stack.isEmpty()) return false;

                Character lastCharacter = stack.peek();
                Character value = matchingParen.get(c);
                if(lastCharacter.equals(value)) {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        // Example usage
        String sampleExpression = "([a+b]{c+d})";
        System.out.println(isValidExpression(sampleExpression));    // Expected output: true

        String badExpression = "([a+b]{c+d}))";
        System.out.println(isValidExpression(badExpression));       // Expected output: false
    }
}