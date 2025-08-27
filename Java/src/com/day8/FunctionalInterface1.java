package com.day8;


@FunctionalInterface
interface Square {
   int calculate(int x);
}
public class FunctionalInterface1 {
   public static void main(String args[]) {
       int a = 5;
       // lambda expression to define the calculate method
       Square s = (int x) -> x * x;
       // parameter passed and return type must be same as defined in the prototype
       int ans = s.calculate(a);
      System.out.println(ans);
   }
}
