package com.day9;

import java.util.*;

public class Reduce {
   public static void main(String[] args) {
      // Creating list of integers
      List<Integer> numbers = Arrays.asList(-2, 0, 4, 6, 8);
 
      // Using reduce to find the sum of all elements
       int sum = numbers.stream()
          .reduce(0, (element1, element2) -> element1 + element2);
 
      System.out.println("The sum of all elements is " + sum); 
   }
}
