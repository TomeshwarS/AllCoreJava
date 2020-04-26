package com;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		
		
		Queue<String> uqueue=new PriorityQueue<>(new MyComp());
		uqueue.add("ZZZZ");

		uqueue.add("CCC");
		uqueue.add("AAA");
		uqueue.add("BBB");
		
		
		System.out.println("Head "+uqueue.peek());
		System.out.println(uqueue);
		
		// Removing 
		System.out.println(uqueue.poll());
		System.out.println(uqueue.remove());

		System.out.println(uqueue);

		
		for (String string : uqueue) {
			
			System.out.println("String "+string);
			
		}

	}

}
