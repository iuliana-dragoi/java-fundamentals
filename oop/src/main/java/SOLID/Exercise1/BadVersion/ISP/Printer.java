package main.java.SOLID.Exercise1.BadVersion.ISP;

/**
 Problem: Printer is forced to implement irrelevant methods. Violating ISP.
 * **/

public class Printer implements Machine {

    @Override
    public void print(Document document) {
        System.out.println("Printing: " + document.getName());
    }

    @Override
    public void scan(Document document) {
        throw new UnsupportedOperationException("Scan not supported!");
    }

    @Override
    public void fax(Document document) { throw new UnsupportedOperationException("Fax not supported!");}
}
