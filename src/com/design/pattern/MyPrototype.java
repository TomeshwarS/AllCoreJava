package com.design.pattern;

public class MyPrototype implements Cloneable {

	private Integer id;
	private String name;

	private MyPrototype() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	private MyPrototype(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		MyPrototype m = new MyPrototype();
		MyPrototype m11 =(MyPrototype) m.clone();
		
		System.out.println(m.hashCode());
		
		
		System.out.println(m11.hashCode());

	}

}
