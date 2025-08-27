package com.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class NameComparator1 implements Comparator<School> {
	@Override
	public int compare(School s1, School s2) {
		return s1.getSchoolName().compareTo(s2.getSchoolName());
	}
}

public class SchoolMain {

	public static void main(String[] args) {
		ArrayList<School> school = new ArrayList<>();
		school.add(new School("Jems", "whitefield", "benagaluru"));
		school.add(new School("Artis", "Noida", "Delhi"));
		school.add(new School("Giet", "Gunupur", "Odisha"));

		System.out.println("Before sorting: " + school);

		// Sort the list using the custom NameComparator
		Collections.sort(school, new NameComparator1());

		System.out.println("After sorting by name: " + school);
		

	}

}
