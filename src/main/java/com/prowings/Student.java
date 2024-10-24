package com.prowings;

import java.io.Serializable;

public class Student implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	private static int roll = 1111;
	private String name;
	private Address address;
	private String adharNumber;
	

	public Student() {
	}

	public Student(int roll, String name, Address address,String adhar) {
		super();
		this.name = name;
		this.address = address;
		this.adharNumber = adhar;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", adharNumber=" + adharNumber + "]";
	}

	
}
