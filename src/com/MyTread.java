package com;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyTread implements Callable<String> {

	@Override
	public String call() throws Exception {

		Bussines b = new Bussines();
		int totalSum = 0;

		for (int i = 0; i < 2; i++) {
			totalSum = totalSum + b.calSum(i, i);

		}

		return "" + totalSum;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newFixedThreadPool(2);

		MyTread mt = new MyTread();

		Future<String> outs = es.submit(mt);

		System.out.println("  >>> " + outs.get());

	}
}
