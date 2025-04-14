package main.java.SmartEntertaimentManagementSystem.SuperHero;

public class Main {

    public static void main(String[] args) {
        SuperHero ironman = new SuperHero("Ironman", SuperHeroType.IRONMAN);
        ironman.fight();

        SuperHero batman = new Batman();
        batman.fight();

        SuperHero superman = new Superman();
        superman.fight();
    }
}
