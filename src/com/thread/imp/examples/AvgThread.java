package com.thread.imp.examples;

import java.util.concurrent.Callable;

public class AvgThread implements Callable<Integer> {

	public Integer maxEle = 0;
	public Integer sum = 0;
	

	@Override
	public Integer call() throws Exception {
		return sum/maxEle;
	}

}