package com.day6;

import java.util.HashMap;
import java.util.Map;
public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> studentScores = new HashMap<>();
        // Add elements to the map
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 92);
        // Get a value
        int bobScore = studentScores.get("Bob");
        System.out.println("Bob's score: " + bobScore);
        // Check if a key exists
        boolean containsAlice = studentScores.containsKey("Alice");
        System.out.println("Contains Alice? " + containsAlice);
        // Iterate over the map
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
