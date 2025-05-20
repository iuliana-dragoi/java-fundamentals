package src.main.java.Exercises1;

import java.util.function.Predicate;

//9. Check if number is prime using lambda
//Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
public class Ex9 {

    public static void main(String[] args) {

        Predicate<Integer> isPrime = n -> {
            if(n <= 1) {
                return false;
            }

            System.out.println("Math.sqrt(n) = " + Math.sqrt(n));
            for(int i = 2; i <= Math.sqrt(n); i++) { // Math.sqrt = √n
                System.out.println("i = " + i + ": n % i = " + n % i);
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        };

        boolean test = isPrime.test(56);
        System.out.println(test);
    }
}
