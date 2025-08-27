package com.day8;

import java.util.function.Supplier;

@FunctionalInterface
interface Calculate {
   int operation(int x);
}
public class FunctionalInterface2 {
	public static void main(String[] args) {
		Supplier<Double> addValue = () -> Math.random()+Math.random();
		Supplier<Double> subValue = () -> Math.random()-Math.random();
		System.out.println(subValue.get());
	}

}
