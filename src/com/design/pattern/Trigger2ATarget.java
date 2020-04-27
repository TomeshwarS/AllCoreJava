package com.design.pattern;

public class Trigger2ATarget extends Thread {

	@Override
	public void run() {

			ATarget.m1();

	}
	
	public static void main(String[] args) {
		
		Trigger2ATarget t=new Trigger2ATarget();
		t.setName("Trigger2ATarget");
		  t.start();
		
		
	}

}