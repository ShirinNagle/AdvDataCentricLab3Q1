package com.lab3;

public class Person {
	String fname;
	String sname;
	Address address;
	public Person(String fname, String sname, Address address) {
		super();
		this.fname = fname;
		this.sname = sname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", sname=" + sname + ", address=" + address + "]";
	}
	

}
