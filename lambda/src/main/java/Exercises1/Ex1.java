package src.main.java.Exercises1;

import src.main.java.Exercises1.Interfaces.SumCalculator;

//1. Sum two integers using lambda expression
//Write a Java program to implement a lambda expression to find the sum of two integers.
public class Ex1 {

    public static void main(String[] args) {
//        SumCalculator sumCalculator = (x, y) -> x + y;
        SumCalculator sumCalculator = Integer::sum;
        int result = sumCalculator.sum(10, 20);
        System.out.println(result);
    }
}
