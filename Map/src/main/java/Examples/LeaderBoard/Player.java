package main.java.Examples.LeaderBoard;

import java.util.Map;
import java.util.TreeMap;

class Player implements Comparable<Player> {

    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Player other) {
        if (this.score == other.score) {
            return this.name.compareTo(other.name);
        }
        return Integer.compare(this.score, other.score);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Player player = (Player) obj;
        return score == player.score && name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return (name + score).hashCode(); // Simple hash code generation
    }

    @Override
    public String toString() {
        return "(" + name + ", " + score + ")";
    }
}