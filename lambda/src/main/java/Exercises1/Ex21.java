package src.main.java.Exercises1;

import java.util.stream.IntStream;

//21. Sum all primes in range using lambda
//Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.
public class Ex21 {

    public static void main(String[] args) {

        int start = 100;
        int end = 200;

        int result = IntStream.range(start, end).filter(Ex21::isPrime).sum();
        System.out.println(result);
    }

    public static boolean isPrime(Integer n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
