package com.clonning.shallowclonning;

public class Address {
	
	public String ta;
	public String pa;
	
	
	
	public String getTa() {
		return ta;
	}



	public void setTa(String ta) {
		this.ta = ta;
	}



	public String getPa() {
		return pa;
	}



	public void setPa(String pa) {
		this.pa = pa;
	}



	@Override
	public String toString() {
		return "Address [ta=" + ta + ", pa=" + pa + "]";
	}
	

}
