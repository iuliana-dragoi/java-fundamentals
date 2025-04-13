package main.java.Examples.Cafe;

public class Main {

    public static void main(String[] args) throws Exception  {

        OrderManagement solution = new OrderManagement();
        solution.addOrder(2);
        solution.addOrder(3);
        solution.addOrder(5);

        int order = solution.serveOrder();
        System.out.println("Served " + order);

    }
}
