package src.main.java.Exercises2;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

//5. Check if age is over 18 using Predicate<Integer>
//Check whether a number representing age is greater than 18.
public class Ex5 {

    public static void main(String[] args) {

        Predicate<Integer> checkAge = age -> age > 18;
        boolean check = checkAge.test(18);
        System.out.println(check);
        exampleWithBiPredicate();
    }

    private static void exampleWithBiPredicate() {
        BiPredicate<Integer, Integer> checkAgeAndGrade = (age, grade) -> age > 18 && grade >= 5;
        System.out.println(checkAgeAndGrade.test(18, 5));
    }
}
