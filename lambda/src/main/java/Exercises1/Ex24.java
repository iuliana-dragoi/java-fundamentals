package src.main.java.Exercises1;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

//24. Find largest prime factor using lambda
//Write a Java program to implement a lambda expression to find the largest prime factor of a given number.
public class Ex24 {

    public static void main(String[] args) {

        int n = 176;
        long largestPrimeFactor = IntStream.rangeClosed(2, (int) Math.sqrt(n))
            .filter(i -> n % i == 0)
            .filter(Ex24::isPrime)
            .max()
            .orElse(n);
        System.out.println(largestPrimeFactor);
    }

    public static boolean isPrime(int n) {
        return LongStream.rangeClosed(2, (long) Math.sqrt(n)).allMatch(e -> e % n == 0);
    }
}
