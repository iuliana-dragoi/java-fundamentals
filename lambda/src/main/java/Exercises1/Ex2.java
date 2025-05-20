package src.main.java.Exercises1;

import java.util.function.Predicate;

//2. Check if a string is empty using lambda
//Write a Java program to implement a lambda expression to check if a given string is empty.
public class Ex2 {

    public static void main(String[] args) {

//        Predicate<String> isEmptyString = str -> str.isEmpty();
        Predicate<String> isEmptyString = String::isEmpty;

        String str1 = "";
        String str2 = "Java lambda expression";

        System.out.println(isEmptyString.test(str1));
        System.out.println(isEmptyString.test(str2));
    }
}
