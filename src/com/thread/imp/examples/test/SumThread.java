package com.thread.imp.examples.test;

public class SumThread extends Thread {

	public static int sum = 0;
	public static int avg = 10;

	@Override
	public void run() {

		System.out.println("Inside Run method");
		for (int i = 0; i <= 10; i++) {

			sum = sum + i;

		}

	}

	public static class AvgThread extends Thread {
		@Override
		public void run() {
             System.out.println("sum kk"+sum + "  result"+ (sum / 2));
			avg = sum /2;
		}

	}

	public static void main(String[] args)   {

		Thread s = new SumThread();
		s.start();

		
		
		try {
			s.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 
		
		System.out.println("Sum is " + sum);
		Thread a = new AvgThread();

		a.start();
		
		System.out.println("Avg  is " + avg);


	}

}
