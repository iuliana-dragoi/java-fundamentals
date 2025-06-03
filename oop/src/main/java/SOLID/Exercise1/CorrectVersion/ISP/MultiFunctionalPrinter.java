package main.java.SOLID.Exercise1.CorrectVersion.ISP;

/**
 MultiFunctionPrinter only implements what it needs, combining several small interfaces.
**/

public class MultiFunctionalPrinter implements Printer, Scanner, Fax {

    @Override
    public void fax(Document document) {
        System.out.println("Faxing: " + document.getName());
    }

    @Override
    public void print(Document document) {
        System.out.println("Printing: " + document.getName());
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning: " + document.getName());
    }
}
