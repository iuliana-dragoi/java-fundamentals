package main.java;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        example5();
    }

    public static void example1() {
        // TreeMap with fruits as keys and corresponding counts as values
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("banana", 3);
        treeMap.put("apple", 4);
        treeMap.put("pear", 1);
        treeMap.put("orange", 2);

        // Print the TreeMap
        System.out.println(treeMap); // the keys are sorted in alphabetical order.
    }

    public static void example2() {
        // Initialize TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("banana", 3);
        treeMap.put("apple", 4);
        treeMap.put("pear", 1);
        treeMap.put("orange", 2);

        // 'apple' is less than or equal to 'apple'
        System.out.println("Ceiling key of 'apple': " + treeMap.ceilingKey("apple")); // Output: apple

        // 'apple' is less than or equal to 'apple'
        System.out.println("Floor key of 'apple': " + treeMap.floorKey("apple")); // Output: apple

        // Remove 'apple' and print the removed value
        Integer removedValue = treeMap.remove("apple");
        System.out.println("Removed value: " + removedValue); // Output: 4

        // Attempt to fetch a nonexisting key
        Integer value = treeMap.get("apple");
        if (value == null) {
            System.out.println("Value: Not found"); // Output: Value: Not found
        }

        // Get the last key-value pair
        System.out.println("Last entry: " + treeMap.lastEntry()); // Output: pear=1
    }

    public static void example3() {
        TreeMap<String, Integer> countryPopulations = new TreeMap<>();
        countryPopulations.put("Nigeria", 206);
        countryPopulations.put("Brazil", 213);
        countryPopulations.put("Pakistan", 225);
        countryPopulations.put("Indonesia", 276);

        //Find the country before 'Pakistan' and calculate the country that comes right before it in alphabetical order
        Map.Entry<String, Integer> country = countryPopulations.lowerEntry("Pakistan");
        System.out.println("Country that comes before Pakistan is " + country);
    }

    public static void example4() {
        // Create a TreeMap from the given map
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("pomegranate", 10);
        treeMap.put("grape", 15);
        treeMap.put("orange", 20);
        treeMap.put("apple", 5);

        // Determine and print the fruit that comes right after 'grape' in our catalog
        Map.Entry<String, Integer> entry = treeMap.higherEntry("grape");
        if(entry == null)  {
            System.out.println("No Key Found");
        }
        else {
            System.out.println(entry);
        }
    }

    public static void example5() {
        // Create a TreeMap containing event names and their dates
        TreeMap<String, String> eventDates = new TreeMap<>();
        eventDates.put("Concert", "2023-06-21");
        eventDates.put("Conference", "2023-07-12");
        eventDates.put("Seminar", "2023-06-11");
        eventDates.put("Workshop", "2023-08-05");

        // Write logic to find and display the name of the event that is scheduled immediately after 'Seminar'
        String seminarDate = eventDates.get("Seminar");
        // System.out.println("Seminar="+seminarDate);

        Map.Entry<String, String> nextEvent = null;
        for(Map.Entry<String, String> entry : eventDates.entrySet()) {

            int compare = entry.getValue().compareTo(seminarDate);
            // System.out.println(compare);
            if(compare > 0) {
                nextEvent = entry;
                break;
            }
        }

        System.out.println("Next event is " + nextEvent.getKey());
    }

    public static void example6() {
        // Initialize a TreeMap named participantScores (name -> score mapping) to track the scores of different participants (Feel free to choose any participant names and scores)
        TreeMap<String, Integer> participantScores = new TreeMap<>();
        participantScores.put("Jhon", 5);
        participantScores.put("Alice", 2);
        participantScores.put("Mark", 1);
        participantScores.put("Billy", 3);
        participantScores.put("Janice", 4);

        int highestScore = 0;
        String winner = "";
        // Determine who has the highest score and print their name as the top performer
        for(Map.Entry<String, Integer> entry : participantScores.entrySet()) {
            int compare = entry.getValue().compareTo(highestScore);
            if(compare > 0) {
                highestScore = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("The Winner is " + winner);
        System.out.println("Highest Score = " + highestScore);
    }
}
