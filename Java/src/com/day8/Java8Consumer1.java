package com.day8;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Java8Consumer1 {
 
   public static void main(String[] args) {
 
      Consumer<String> print = x -> System.out.println(x);
      print.accept("java");   // java
      
      
      Predicate<Integer> isEven = i -> i % 2 == 0;
      System.out.println(isEven.test(4)); // Output: true
      System.out.println(isEven.test(7)); // Output: false
 
   }
 
}
