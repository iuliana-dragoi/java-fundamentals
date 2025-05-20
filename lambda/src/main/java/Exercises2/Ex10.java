package src.main.java.Exercises2;

import java.util.function.Predicate;

//10. Check if number is even using lambda
//Write a Predicate<Integer> that checks whether a number is even.
public class Ex10 {

    public static void main(String[] args) {
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.test(2));
        System.out.println(isEven.test(3));
    }
}
