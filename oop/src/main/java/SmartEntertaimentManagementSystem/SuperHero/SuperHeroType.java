package main.java.SmartEntertaimentManagementSystem.SuperHero;

public enum SuperHeroType {

    IRONMAN("Technology", "Battery life"),
    SUPERMAN("Super strength", "Kryptonite"),
    BATMAN("Intelligence", "No superpower");

    private final String power;
    private final String weakness;

    SuperHeroType(String power, String weakness) {
        this.power = power;
        this.weakness = weakness;
    }

    public String getPower() {
        return power;
    }

    public String getWeakness() {
        return weakness;
    }
}
