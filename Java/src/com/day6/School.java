package com.day6;

public class School {
	private String schoolName;
	private String location;
	private String address;
	public School(String schoolName, String location, String address) {
		
		this.schoolName = schoolName;
		this.location = location;
		this.address = address;
	}
	public String getSchoolName() {
		return schoolName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", location=" + location + ", address=" + address + "]";
	}
	
	
	
	
	

}
