package main.java.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ex4 {

    public static void main(String[] args) {

       List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        OptionalDouble average = list.stream()
                .mapToInt(Integer::intValue) // Converts to primitive value.
                .average();

        if(average.isPresent()) {
            System.out.println(average.getAsDouble());
            List<Integer> aboveAverage = list.stream().filter(n -> n > average.getAsDouble()).toList();
            System.out.println(aboveAverage);
        }
    }
}
