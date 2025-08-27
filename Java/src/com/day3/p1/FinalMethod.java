package com.day3.p1;

class AB {
	final void m1() {
		System.out.println("This is a final method.");
	}
}

class FinalMethod extends AB {
//	void m1() {
//		
//		System.out.println("Illegal!");
//	}
	public static void main(String[] args) {
		FinalMethod f= new FinalMethod();
		f.m1();
	}
}