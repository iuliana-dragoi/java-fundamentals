package src.main.java.Exercises1;

import java.util.function.Function;

//25. Convert integer to binary using lambda
//Write a Java program to implement a lambda expression to convert an integer to their corresponding binary representation.
public class Ex25 {

    public static void main(String[] args) {
        Function<Integer, String> convertToBinary = Integer::toBinaryString;
        String binaryRepresentation = convertToBinary.apply(12);
        System.out.println(binaryRepresentation);
    }
}
