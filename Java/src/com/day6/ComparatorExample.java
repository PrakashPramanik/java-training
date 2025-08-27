package com.day6;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
 
// Comparator to sort Student objects by name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
 
public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 101));
        students.add(new Student("Bob", 103));
        students.add(new Student("Charlie", 102));
 
        System.out.println("Before sorting: " + students);
 
        // Sort the list using the custom NameComparator
        Collections.sort(students, new NameComparator());
 
        System.out.println("After sorting by name: " + students);
    }
}
