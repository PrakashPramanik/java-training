package com.day3.p1;

public class AreaCir {
	
	final double PI=3.141;
	
	public void circumference(int r) {
		System.out.println(2*PI*r);
	}
	
	public void area(int r) {
		System.out.println(2*r*r);
	}

	public static void main(String[] args) {
		
		AreaCir a = new AreaCir();
		a.area(3);
		a.circumference(5);
	}

}
