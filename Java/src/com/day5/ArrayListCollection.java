package com.day5;

import java.util.ArrayList;

public class ArrayListCollection {
      
      public static void main(String args[])
      {
            ArrayList<String> al = new ArrayList<String>();
            ArrayList<String> a2 = new ArrayList<String>();
            al.add("apple");
            al.add("banana");
            al.add("mango");
            al.add("pinaple");
            
            a2.add("adsad");
            a2.add("asdf");
            
            al.addAll(a2);
           
            
            for(int i=0;i<al.size();i++)
            {
                   System.out.println(al.get(i));
            }
            
            for (String n :  al) {
                System.out.println("Number = " + n);
            }
      }
 
}