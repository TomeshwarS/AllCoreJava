package com.inheritance.ex;


  public class ABImpl implements A1,B1{

	@Override
	public int m1() {
		
	   return B1.super.m1();
	}
  
	
  }
 