package com.thread.imp.examples;

import java.util.concurrent.Callable;

public class WorkerThread2 implements Callable<String> {
	private String message;

	public WorkerThread2(String s) {
		this.message = s;
	}

	public String call() {
		//System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
		processmessage();
	// 	System.out.println(Thread.currentThread().getName() + " (End)");
		return message;
	}

	private void processmessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
