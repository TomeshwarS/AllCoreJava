package com.thread.imp.examples.test;

public class AvgThread extends Thread {

	public int sum = 0;

	public int avg = 0;

	@Override
	public void run() {

		avg = sum / 10;
	}

}
