package com.thread.imp.examples;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TriggerMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newFixedThreadPool(2);

		SumThread sunThread = new SumThread();
		sunThread.intMaxCount = 1000;
	      System.out.println("Calculating Sum  ");

		Future<Integer> sum = es.submit(sunThread);
		

		Integer sumCal = sum.get();

		System.out.println("sum  " + sumCal);

		AvgThread avgThread = new AvgThread();
		

		avgThread.maxEle = 1000;
		avgThread.sum = sumCal;
      System.out.println("Calculating Average ");
		Future<Integer> future = es.submit(avgThread);
		Integer avgCalculated = future.get();
		
		System.out.println("Avg "+ avgCalculated);

	}

}
