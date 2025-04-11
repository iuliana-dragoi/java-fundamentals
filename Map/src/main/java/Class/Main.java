package main.java.Class;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        example1();
        example2();
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

}
