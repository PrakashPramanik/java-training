package com.day7;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Child thread (from Runnable) is running.");
	}
}

public class ParentThreadRunnableExample {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread childThread = new Thread(runnable);
		childThread.start(); // Starts the child thread
		System.out.println("Parent thread continues execution.");
	}
}
