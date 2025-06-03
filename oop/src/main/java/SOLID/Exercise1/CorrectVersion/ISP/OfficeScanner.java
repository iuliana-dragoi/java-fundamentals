package main.java.SOLID.Exercise1.CorrectVersion.ISP;

public class OfficeScanner implements Scanner {

    @Override
    public void scan(Document document) {
        System.out.println("Scanning: " + document.getName());
    }
}
