package main.java.SmartEntertaimentManagementSystem.SuperHero;

public class Batman extends SuperHero {

    public Batman() {
        super("Batman", SuperHeroType.BATMAN);
    }

    @Override
    public void fight() {
        System.out.println("Batman fights with gadgets and strategy!");
    }
}
