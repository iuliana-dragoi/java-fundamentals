package main.java.SOLID.Exercise1.BadVersion.ISP;

/**
 Clients should not be forced to depend on interfaces they do not use.
 In other words:
    -An interface should not be too big ("fat").
    -If you have methods that certain classes cannot implement correctly, it is a sign that the interface is too generic and should be broken into smaller, more specialized interfaces.
 * **/

public interface Machine {

    void print(Document document);
    void scan(Document document);
    void fax(Document document);
}
