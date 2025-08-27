package com.day7;

import java.lang.Thread; // Importing the Thread class

public class ThreadStateExample implements Runnable { // Implementing the Runnable interface
	private Thread thread;
	private String threadName;

	public ThreadStateExample(String name) {
		threadName = name;
		System.out.println("Thread: " + threadName + ", State: NEW"); // Thread is in the NEW state after creation
	}

	public void run() {
		System.out.println("Thread: " + threadName + ", State: RUNNABLE"); // Thread transitions to RUNNABLE state
		try {
			// Demonstrate Timed_Waiting state
			System.out.println("Thread: " + threadName + ", State: TIMED_WAITING (sleeping for 1 second)");
			Thread.sleep(1000); // Thread enters TIMED_WAITING state

			// Demonstrate Blocked state (simulated)
			synchronized (this) { // Acquire a lock on the current object
				System.out.println("Thread: " + threadName + ", State: BLOCKED (entering synchronized block)");
				// Simulating a scenario where another thread might be holding a lock
				// In a real scenario, another thread attempting to enter this block
				// would be BLOCKED
			}

			// Demonstrate Waiting state (simulated)
			synchronized (this) { // Acquire a lock on the current object
				System.out.println("Thread: " + threadName + ", State: WAITING (waiting for notification)");
				wait(); // Thread enters WAITING state, releases the lock
			}

		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread: " + threadName + ", State: TERMINATED"); // Thread enters TERMINATED state after
																				// completing its execution
	}

	public void start() {
		System.out.println("Thread: " + threadName + ", State: Starting");
		if (thread == null) {
			thread = new Thread(this, threadName);
			thread.start(); // Invoking the start() method transitions the thread to RUNNABLE
		}
	}

	public Thread getThread() {
		return thread;
	}

	// Method to notify a waiting thread
	public synchronized void notifyWaitingThread() {
		System.out.println("Thread: " + threadName + ", Notifying waiting thread...");
		notify(); // Notifies a single waiting thread on this object's monitor
	}

	public static void main(String args[]) {
		ThreadStateExample thread1 = new ThreadStateExample("Thread-1");
		thread1.start();

		System.out.println("Thread-1 state after starting: " + thread1.getThread().getState()); // Should be RUNNABLE

		try {
			// Main thread waits for a bit to allow thread1 to enter TIMED_WAITING
			Thread.sleep(200);
			System.out.println(
					"Thread-1 state after sleep (potentially TIMED_WAITING): " + thread1.getThread().getState()); // Could
																													// be
																													// TIMED_WAITING
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Simulate another thread attempting to acquire the lock and being blocked
		Thread blockedThread = new Thread(() -> { // Creates a new thread using a lambda expression
			try {
				System.out.println("Blocked thread attempting to acquire lock...");
				synchronized (thread1) { // Acquiring the lock held by thread1 (simulated)
					System.out.println("Blocked thread acquired lock (this won't print if actually blocked)");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		blockedThread.start();
		try {
			Thread.sleep(10); // Allow blockedThread to attempt to acquire the lock
			System.out.println("Blocked thread state (should be BLOCKED): " + blockedThread.getState()); // Should be
																											// BLOCKED
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Notify the waiting thread (thread1)
		thread1.notifyWaitingThread(); // Causes thread1 to move from WAITING to RUNNABLE

		try {
			thread1.getThread().join(); // Main thread waits for thread1 to finish
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Thread-1 state after join (should be TERMINATED): " + thread1.getThread().getState()); // Should
																													// be
																													// TERMINATED
	}
}