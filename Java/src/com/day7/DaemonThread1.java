package com.day7;

class DaemonThread extends Thread {
	// Override the run Method
	@Override
	public void run() {
		System.out.println("Running the Daemon Thread");
	}
}

// Driver Class
public class DaemonThread1 {
	public static void main(String[] args) {
		DaemonThread t1 = new DaemonThread();
		t1.setDaemon(true);

		t1.start();
	}
}
