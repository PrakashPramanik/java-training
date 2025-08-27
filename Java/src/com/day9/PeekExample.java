package com.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class PeekExample {
   public static void main(String[] args) {
       List<String> words = Arrays.asList("apple", "banana", "orange");
 
       List<String> processedWords = words.stream()
           .peek(word -> System.out.println("Before map: " + word)) // Peek before mapping
           .map(String::toUpperCase)
           .peek(word -> System.out.println("After map: " + word))  // Peek after mapping
           .collect(Collectors.toList());
 
       System.out.println("Final list: " + processedWords);
   }
}