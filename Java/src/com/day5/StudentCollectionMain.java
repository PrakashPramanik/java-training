package com.day5;

import java.util.*;

public class StudentCollectionMain {
	public static void main(String args[])
	{
		StudentCollection shyam = new StudentCollection("shyam", 1, 21);
		StudentCollection david = new StudentCollection("david", 2, 24);
		StudentCollection ram= new StudentCollection("ram", 3, 25);
		ArrayList<StudentCollection> al = new ArrayList<StudentCollection>();
		al.add(shyam);
		al.add(david);
		al.add(ram);
//		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).getName());
			System.out.println(al.get(i).getRollNo());
			System.out.println(al.get(i).getAge());
			
			System.out.println("_________________________________");
		}
		
		
		System.out.println("Example of For Loop_______________________");
		for(StudentCollection st : al )
		{
			System.out.println(st.getName());
			System.out.println(st.getRollNo());
			System.out.println(st.getAge());
			
			System.out.println("_________________________________");
		}
		
	}
 
}