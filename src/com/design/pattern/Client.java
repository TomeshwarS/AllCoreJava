package com.design.pattern;

public class Client {
	public static void main(String arg[]) throws Exception {
		ConcretePrototype obj1 = new ConcretePrototype();
		ConcretePrototype obj2 = (ConcretePrototype) obj1.clone();
     
		System.out.println("Clone "+ obj1.hashCode());


		System.out.println("Clone "+ obj2.hashCode());

	
	
	
	}
}