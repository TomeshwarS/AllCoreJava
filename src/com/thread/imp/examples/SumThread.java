package com.thread.imp.examples;

import java.util.concurrent.Callable;

public class SumThread implements Callable<Integer> {

	public Integer intMaxCount = 0;

	@Override
	public Integer call() throws Exception {

		Integer sum = 0;
		for (int i = 0; i <= intMaxCount; i++) {
			sum = sum + i;
		}

		return sum;
	}
	


}
