package main.java.SOLID.Exercise1.CorrectVersion.ISP;

/**
 SimplePrinter only implements Printer, it is not required to implement scan() and fax().
 **/

public class SimplePrinter implements Printer {

    @Override
    public void print(Document document) {
        System.out.println("Printing: " + document.getName());
    }
}
