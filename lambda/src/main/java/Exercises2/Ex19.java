package src.main.java.Exercises2;

import java.util.Arrays;
import java.util.List;

//19. Filter out duplicate words using distinct() and lambda
//Remove duplicates from a list of words.
public class Ex19 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "a", "b");
        list.stream().distinct().forEach(System.out::println);
    }
}
