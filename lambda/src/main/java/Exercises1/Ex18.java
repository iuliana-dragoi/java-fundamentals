package src.main.java.Exercises1;

import java.util.function.Predicate;

//18. Check if number is a perfect square using lambda
//Write a Java program to implement a lambda expression to check if a given number is a perfect square.
public class Ex18 {

    public static void main(String[] args) {
        Predicate<Integer> isPerfectSquare = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        System.out.println(isPerfectSquare.test(36));
        System.out.println(isPerfectSquare.test(26));
    }
}
