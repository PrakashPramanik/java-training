package com.day9;

import java.util.Arrays;
import java.util.List;
 
public class AllMatchExample {
   public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
       List<Integer> mixedNumbers = Arrays.asList(1, 2, 3, 4, 5);
 
       // Check if all numbers in 'numbers' list are even
       boolean allEven = numbers.stream()
                                .allMatch(n -> n % 2 == 0);
       System.out.println("Are all numbers in 'numbers' even? " + allEven); // Output: true
 
       // Check if all numbers in 'mixedNumbers' list are even
       boolean allEvenMixed = mixedNumbers.stream()
                                         .allMatch(n -> n % 2 == 0);
       System.out.println("Are all numbers in 'mixedNumbers' even? " + allEvenMixed); // Output: false
   }
}
