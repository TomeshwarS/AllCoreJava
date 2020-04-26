   package com.thread.imp.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SimpleThreadPool2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(5);
      
		List<Future<String>> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			Callable<String> worker = new WorkerThread2("" + i);
			Future<String> output = executor.submit(worker);
			list.add(output);
			
 }
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		
		

		System.out.println("Finished all threads");
		
		
		
		for (Future<String> future : list) {
		
			  System.out.println(future.get());
		}
		
		
		
	}

}