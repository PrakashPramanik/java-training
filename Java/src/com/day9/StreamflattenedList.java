package com.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class StreamflattenedList {
   public static void main(String[] args) {
       List<List<String>> listOfLists = Arrays.asList(
           Arrays.asList("apple", "banana"),
           Arrays.asList("orange", "grape"),
           Arrays.asList("kiwi")
       );
       System.out.println(listOfLists);
 
       // Using flatMap to flatten the list of lists into a single stream of strings
       List<String> flattenedList = listOfLists.stream()
           .flatMap(List::stream) // Applies List::stream to each inner list, producing a stream of strings
           .collect(Collectors.toList());
 
       System.out.println(flattenedList); // Output: [apple, banana, orange, grape, kiwi]
   }
}