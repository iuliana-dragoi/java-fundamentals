package main.java.Examples.LeaderBoard;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<Player, Integer> scores = new TreeMap<>();

        Player player1 = new Player("John", 900);
        Player player2 = new Player("Doe", 1000);

        // Adding players to the TreeMap
        scores.put(player1, player1.score);
        scores.put(player2, player2.score);

        // Print TreeMap
        for (Map.Entry<Player, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey()); // e.g., (John, 900)
        }
    }
}
