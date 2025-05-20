package src.main.java.Exercises1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//19. Find 2nd largest/smallest in array using lambda
//Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.
public class Ex19 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer secondLargest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println("secondLargest = " + secondLargest);

        Integer secondSmallest = list.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        System.out.println("secondSmallest = " + secondSmallest);
    }
}
