package com.lab3;

public class Address {
	String street;
	String town;
	String county;
	public Address(String street, String town, String c) {
		super();
		this.street = street;
		this.town = town;
		this.county = c;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", town=" + town + ", county=" + county + "]";
	}

}
