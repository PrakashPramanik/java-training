package com.day3.p1;

public class StaticDemo {
	   public static void main(String[] args)
	   {
	       // calling static method
	       // without instantiating Student class
	      StudentDetail.setCllg("XYZ");
	 
	       StudentDetail s1 = new StudentDetail("Ram",1);
	       StudentDetail s2 = new StudentDetail("Shyam",2);
	 
	       s1.getStudentInfo();
	       s2.getStudentInfo();
	   }
	}
	 