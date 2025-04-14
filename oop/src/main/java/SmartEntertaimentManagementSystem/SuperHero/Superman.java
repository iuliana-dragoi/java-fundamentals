package main.java.SmartEntertaimentManagementSystem.SuperHero;

public class Superman extends SuperHero {

    public Superman() {
        super("Superman", SuperHeroType.SUPERMAN);
    }

    @Override
    public void fight() {
        System.out.println("Superman uses laser vision and flight!");
    }
}
