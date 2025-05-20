package src.main.java.Exercises1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//7. Remove integer duplicates using lambda
//Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
public class Ex7 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3);
        System.out.println("List: " + list);

        List<Integer> uniqueList = new ArrayList<>();
        list.stream().distinct().forEach(uniqueList::add);
        System.out.println("List without duplicates: " + uniqueList);
    }
}
