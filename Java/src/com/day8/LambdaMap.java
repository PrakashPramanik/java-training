package com.day8;

import java.util.HashMap;

public class LambdaMap {
	public static void main(String[] args) {
		HashMap<Integer, Character> map = new HashMap<>();
		int count =1;
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, 'c');
		
		map.forEach((key, value) -> {
			int c = count;
	        System.out.println("Count is " + ++c); 
//	        int count=c;
			System.out.println("Key: " + key + ", Value: " + value);
		});
	}
}