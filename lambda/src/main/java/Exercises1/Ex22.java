package src.main.java.Exercises1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//22. Check case of strings in list using lambda
//Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase.
public class Ex22 {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Java", "JAVA", "java");
        List<String> list2 = Arrays.asList("JAVA", "JAVA", "JAVA");
        List<String> list3 = Arrays.asList("java", "java", "java");

        checkList(list1);
        checkList(list2);
        checkList(list3);
    }

    private static void checkList(List<String> list) {
        if(allMatch(list, s -> s.equals(s.toUpperCase()))) {
            System.out.println("All uppercase");
        }
        else if(allMatch(list, s -> s.equals(s.toLowerCase()))) {
            System.out.println("All lowercase");
        }
        else {
            System.out.println("Mixed case");
        }
    }

    public static boolean allMatch(List<String> list, Predicate<String> checkFunction) {
        return list.stream().allMatch(checkFunction);
    }
}