package com.design.pattern;

public class Trigger1ATarget extends Thread {

	@Override
	public void run() {

		ATarget.m1();

	}
	
	public static void main(String[] args) {
		
		Trigger1ATarget t=new Trigger1ATarget();
		
		t.setName("Trigger1ATarget");
		  t.start();
		
		
	}

}