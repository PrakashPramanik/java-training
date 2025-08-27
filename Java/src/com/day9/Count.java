package com.day9;


import java.util.*;

class Count {
 
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10, 12);
 
        long total = list.stream().count();
 
        System.out.println(total);
    }
}
