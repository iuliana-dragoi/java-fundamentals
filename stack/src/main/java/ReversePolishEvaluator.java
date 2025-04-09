package main.java;

import java.util.Stack;

/**
 *  This class evaluates expressions written in Reverse Polish Notation (Postfix).
 *  Example input: "1 2 + 4 -"
 *  Logic: (1 + 2) - 4 = -1
 */

public class ReversePolishEvaluator {
    public static int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-")) {
                int second = stack.pop();
                int first = stack.pop();
                int result = token.equals("+") ? first + second : first - second;
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluate("1 2 + 4 -")); // Output: -1
        System.out.println(evaluate("5 3 - 2 +")); // Output: 4
    }
}