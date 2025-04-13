package main.java.Examples.BrowserHistoryManagement;

import java.util.ArrayDeque;
import java.util.Deque;

public class Browser {

    private Deque<String> history;

    private Deque<String> future;

    public Browser() {
        history = new ArrayDeque<>();
        future = new ArrayDeque<>();
    }

    public void visit(String url) {
        // Add the visited URL to the history and clear the future
        history.add(url);
        future = new ArrayDeque<>();
    }

    public String back(int steps) {
        // Move the specified number of steps back in the history, if possible, and update the future accordingly

        int ct = 0;
        while(ct < steps) {
            String url = history.removeLast();
            future.add(url);
            ct++;
        }

        // Return the current page after moving back
        return history.peekLast();
    }

    public String forward(int steps) {
        // Move the specified number of steps forward in the history, if possible, and update the history accordingly
        int ct = 0;

        while(ct < steps) {
            String url = future.removeLast();
            history.add(url);
            ct++;
        }

        // Return the current page after moving forward
        return history.peekLast();
    }
}
