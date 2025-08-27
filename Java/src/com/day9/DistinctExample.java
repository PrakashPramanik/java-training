package com.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class DistinctExample {
   public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);
       // Get distinct numbers using stream().distinct()
       List<Integer> distinctNumbers = numbers.stream()
                                          .distinct()
                                           .collect(Collectors.toList());
       System.out.println("Original numbers: " + numbers);
       System.out.println("Distinct numbers: " + distinctNumbers); 
       // Output: Distinct numbers: [1, 2, 3, 4, 5]
       
       
   }
}
