package main.java.Class;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        example1();
        example2();
        example3();
    }

    public static void example1() {
        Player mary = new Player("Mart", 75);
        Player john = new Player("John", 87);

        TreeMap<Player, String> tournament = new TreeMap<>();
        tournament.put(mary, "2nd place");
        tournament.put(john, "1st place");

        tournament.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey().name + " " + entry.getKey().score + " " + entry.getValue());
        });
    }

    public static void example2() {
        TreeMap<Book, Integer> library = new TreeMap<>();
        library.put(new Book("Author a", "Title 1"), 56);
        library.put(new Book("Author b",  "Title 2"), 80);
        library.entrySet().stream().forEach(entry -> {
            System.out.println(entry);
        });
    }

    public static void example3() {
        TreeMap<Product, Integer> inventory = new TreeMap<>();
        Product product1 = new Product(1, "Milk");
        Product product2 = new Product(2, "Cheese");
        inventory.put(product1, 50);
        inventory.put(product2, 68);

        Product searchKey = new Product(3, "Dummy");
        Map.Entry<Product, Integer> result = inventory.floorEntry(searchKey);

        if (result != null) {
            System.out.println("Found product: " + result.getKey().toString() + " with quantity: " + result.getValue());
        } else {
            System.out.println("No product found with id <= " + searchKey.getId());
        }
    }
}
