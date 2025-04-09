package main.java;

import java.util.Stack;

/***

🧠  Scenario: Validating HTML-like Tags
    You will use a stack to check if a simplified HTML-like tag string is well-nested.
    The tags are represented as words inside angle brackets: <tag> and </tag>.

✅  Task:
    Write a method that returns true if the tags are properly opened and closed in order, otherwise false.

💡  Example:
    Input: "<html><body></body></html>" → true
    Input: "<html><body></html></body>" → false
    Input: "<div><p></p></div>" → true
    Input: "<div><p></div></p>" → false

 ***/

public class TagValidator {

    public static boolean isValidTagSequence(String input, boolean debug) { //<html><body></body></html>
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < input.length();) {
            Character c = input.charAt(i); //<
            if(c == '<') {
                int j = input.indexOf('>', i);  /* Searches the position of next character starting from position i. */
                if(j == -1) return false;           /* Malformed tag */

                String tagContent = input.substring(i+1, j);
                boolean isTagClosing = tagContent.startsWith("/");

                if(isTagClosing) {
                    String tagName = tagContent.substring(1); /* Skip / */
                    if(stack.isEmpty()) return  false;

                    String lastOpened = stack.pop();
                    if (debug) System.out.println("Pop </" + tagName + ">, expected <" + lastOpened + ">");

                    if(!lastOpened.equals(tagName)) return false;

                }
                else {
                    stack.push(tagContent);
                    if (debug) System.out.println("Push <" + tagContent + ">");
                }

                i = j + 1;
            }
            else i++;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        boolean debug = false;

        String[] tests = {
            "<html><body></body></html>",
            "<html><body></html></body>",
            "<div><p></p></div>",
            "<div><p></div></p>"
        };

        if(debug) System.out.println("Input " + "<html><body></body></html>" + " valid= " + isValidTagSequence("<html><body></body></html>", debug));

        else for(String input : tests) {
            System.out.println("Input " + input + " valid= " + isValidTagSequence(input, debug));
        }
    }
}