package main.java.SmartEntertaimentManagementSystem.SuperHero;

public class SuperHero {

    private String name;

    private SuperHeroType type;

    public SuperHero(String name, SuperHeroType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuperHeroType getType() {
        return type;
    }

    public void setType(SuperHeroType type) {
        this.type = type;
    }

    public String getPower() {
        return this.type.getPower();
    }

    public String getWeakness() {
        return this.type.getWeakness();
    }

    public void fight() {
        System.out.println(name + " fights using " + getPower());
    }
}
