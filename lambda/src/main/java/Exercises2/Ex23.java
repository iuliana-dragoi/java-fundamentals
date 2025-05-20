package src.main.java.Exercises2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

//23. Combine two integer lists element by element using BiFunction
//Add elements from two lists of Integer, position by position.
public class Ex23 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        combineVersion1(list1, list2);
        combineVersion2(list1, list2);
        intercalationExample(list1, list2);
    }

    private static void combineVersion1(List<Integer> list1, List<Integer> list2) {
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
            result.add(add.apply(list1.get(i), list2.get(i)));
        }
        System.out.println(result);
    }

    private static void combineVersion2(List<Integer> list1, List<Integer> list2) {
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        List<Integer> result = IntStream.range(0, Math.min(list1.size(), list2.size()))
                .mapToObj(i -> add.apply(list1.get(i), list2.get(i)))
                .toList();
        System.out.println(result);
    }

    private static void intercalationExample(List<Integer> list1, List<Integer> list2) {
        BiFunction<List<Integer>, List<Integer>, List<Integer>> intercalate = (a, b) -> {
            List<Integer> result = new ArrayList<>();
            int ct1 = 0;
            int ct2 = 0;
            for(int i = 0; i < a.size() + b.size(); i++) {
                if(ct1 < a.size()) {
                    result.add(a.get(ct1));
                    ct1++;
                }
                if(ct2 < b.size()) {
                    result.add(b.get(ct2));
                    ct2++;
                }
            }

            return result;
        };

        List<Integer> list3 = intercalate.apply(list1, list2);
        System.out.println(list3);
    }
}
