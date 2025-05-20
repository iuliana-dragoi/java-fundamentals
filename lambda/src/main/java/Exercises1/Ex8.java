package src.main.java.Exercises1;

import java.util.function.LongUnaryOperator;

//8. Calculate factorial using lambda expression
//Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
public class Ex8 {

    // n! = 1 × 2 × 3 × ... × n
    // 5! = 1 × 2 × 3 × 4 × 5 = 120
    public static void main(String[] args) {

        LongUnaryOperator factorial = n -> {
            long result = 1;
            for(long i = 1; i <=n; i++) {
                result *= i;
            }
            return result;
        };

        long n = 7;
        long factorialResult = factorial.applyAsLong(n);
        System.out.println(factorialResult);
    }
}
