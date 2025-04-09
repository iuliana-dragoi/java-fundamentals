package main.java;

import java.util.HashMap;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        example1();
        example2();
        System.out.println(reverseString("HELLO"));
        System.out.println(isParenBalanced("(())")); // Outputs: true
        System.out.println(isParenBalanced("({[)}")); // Outputs: false
    }

    public static void example1() {
        Stack<String> stack = new Stack<>(); // A new empty stack (LIFO rule)

        // Push operations
        stack.push("John");
        stack.push("Mary");
        stack.push("Steve");

        stack.pop(); // Pop operation removes 'Steve'
        System.out.println(stack); // Outputs: [John, Mary]

        System.out.println(isParenBalanced("(())")); // Outputs: true
        System.out.println(isParenBalanced("({[)}")); // Outputs: false
    }

    public static void example2() {
        Stack<String> stack = new Stack<>();
        stack.push("Steve");
        stack.push("Sam");

        System.out.println(stack.peek()); // Outputs: 'Sam'

        System.out.println(stack.empty()); // Outputs: false
        stack.pop(); // Remove 'Sam'
        stack.pop(); // Remove 'Steve'
        System.out.println(stack.empty()); // Outputs: true
    }

    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.empty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static boolean isParenBalanced(String parenString) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> openingParen = new HashMap<>();
        openingParen.put(')', '(');
        openingParen.put(']', '[');
        openingParen.put('}', '{');

        for (char paren : parenString.toCharArray()) {
            if (openingParen.containsValue(paren)) {
                // We met an opening parenthesis, just putting it on the stack
                stack.push(paren);
            } else if (openingParen.containsKey(paren)) {
                // We met a closing parenthesis
                if (stack.isEmpty() || stack.pop() != openingParen.get(paren)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
