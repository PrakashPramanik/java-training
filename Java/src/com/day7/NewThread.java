package com.day7;

class NewThread extends Thread {
	NewThread(String threadname, ThreadGroup tgob) {
		super(tgob, threadname);
		start();
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("hello Under Run of Thread");
			} catch (InterruptedException ex) {
				System.out.println("Exception encounterted");
			}
		}
	}
}