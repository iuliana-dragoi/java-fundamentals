package main.java.Examples.BrowserHistoryManagement;

public class Main {

    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.visit("example.com");
        browser.visit("wikipedia.org");
        browser.visit("twitter.com");

        System.out.println("Went back, current page: " + browser.back(2));
        System.out.println("Went forward, current page: " + browser.forward(1));
    }
}
