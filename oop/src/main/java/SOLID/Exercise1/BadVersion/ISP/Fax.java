package main.java.SOLID.Exercise1.BadVersion.ISP;

public class Fax implements Machine {


    @Override
    public void print(Document document) {
        throw new UnsupportedOperationException("Print not supported!");
    }

    @Override
    public void scan(Document document) {
        throw new UnsupportedOperationException("Scanning not supported!");
    }

    @Override
    public void fax(Document document) {  System.out.println("Faxing: " + document.getName()); }
}
