package src.main.java.Exercises1;

import src.main.java.Exercises1.Interfaces.WordCounter;

//13. Count words in sentence with lambda
//Write a Java program to implement a lambda expression to count words in a sentence.
public class Ex13 {

    public static void main(String[] args) {

        String sentence = "This is a sentence";

        WordCounter wordCounter = (text) -> text.split(" ").length;
        int count = wordCounter.countWords(sentence);
        System.out.println(count);
    }
}
