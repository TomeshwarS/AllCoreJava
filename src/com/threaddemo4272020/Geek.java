package com.threaddemo4272020;
// Java program to illustrate 
// Object lock concept 
public class Geek implements Runnable { 
	public void run() 
	{ 
		Lock(); 
	} 
	public static void Lock() 
	{ 
		System.out.println(Thread.currentThread().getName()); 
		synchronized(String.class) 
		{ 
			System.out.println("in block "
				+ Thread.currentThread().getName()); 
			
			try {
				Thread.sleep(20*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("in block " + 
				Thread.currentThread().getName() + " end"); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		Geek g = new Geek(); 
		Thread t1 = new Thread(g); 
		Thread t2 = new Thread(g); 
      Geek g1 = new Geek(); 
		Thread t3 = new Thread(g1); 
		t1.setName("t1"); 
		t2.setName("t2"); 
		 t3.setName("t3"); 
		 
		 
		t1.start(); 
		t2.start(); 
     	t3.start(); 
	} 
} 
