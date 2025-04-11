package main.java.Class;

public class Player implements Comparable<Player> {

    String name;

    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Player)) return false;
        Player o = (Player) obj;
        return this.name == o.name && this.score == o.score;
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(o.score, this.score);
    }
}