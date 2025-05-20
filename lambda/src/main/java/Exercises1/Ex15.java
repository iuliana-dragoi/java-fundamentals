package src.main.java.Exercises1;

import java.util.Arrays;
import java.util.List;

//15. Sum squares of odd/even numbers using lambda
//Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.
public class Ex15 {

    // Square of a number = n * n OR n²
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumSquaresEven = list.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(n -> n * n)
            .sum();
        System.out.println("subOfEvenSquares=" + sumSquaresEven);

        int subSquaresOdd = list.stream()
            .filter(n -> n % 2 == 1)
            .mapToInt(n -> n * n)
            .sum();
        System.out.println("subOfOddSquares=" + subSquaresOdd);
    }
}
