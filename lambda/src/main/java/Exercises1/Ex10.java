package src.main.java.Exercises1;

import java.util.function.BiFunction;

//10. Concatenate two strings using lambda
//Write a Java program to implement a lambda expression to concatenate two strings.
public class Ex10 {

    public static void main(String[] args) {

        BiFunction<String, String, String> concatenate = (a, b) -> a + b;
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Test";
        String result = concatenate.apply(s1, s2);
        String result2 = concatenate.apply(result, s3);
        System.out.println(result2);
    }
}
