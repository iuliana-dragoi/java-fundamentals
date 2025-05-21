package src.main.java.Exercises3;

import java.util.HashMap;
import java.util.Map;

//8.Merge two HashMaps containing product stock counts. Given two HashMaps representing stock counts of products in two warehouses,
//merge them by summing the counts for matching product keys using Map.merge() and a lambda.
public class Ex8 {

    public static void main(String[] args) {

        Map<String, Integer> warehouse1 = new HashMap<>();
        warehouse1.put("Milk", 1);
        warehouse1.put("Cheese", 2);
        warehouse1.put("Potato", 3);

        Map<String, Integer> warehouse2 = new HashMap<>();
        warehouse2.put("Milk", 1);
        warehouse2.put("Cheese", 20);
        warehouse2.put("Potato", 3);

        Map<String, Integer> mergedStock = new HashMap<>(warehouse1);
        warehouse2.forEach((product, count) -> {
            mergedStock.merge(product, count, Integer::sum);
        });

        System.out.println(mergedStock);
    }
}