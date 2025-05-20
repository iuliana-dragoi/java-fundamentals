package src.main.java.Exercises1;

import java.util.Arrays;
import java.util.List;

//3. Convert strings to upper/lowercase using lambda
//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
public class Ex3 {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");
        System.out.println("Original List: " + stringList);

//        stringList.replaceAll(str -> str.toLowerCase());
        stringList.replaceAll(String::toLowerCase);
        System.out.println("List Lower Case: " + stringList);

        stringList.replaceAll(String::toUpperCase);
        System.out.println("List Upper Case: " + stringList);
    }
}
