package com.prowings;

import java.io.Serializable;

public class Student implements Serializable{
	
	private static int roll = 1111;
	private String name;
	private Address address;

	public Student() {
	}

	public Student(int roll, String name, Address address) {
		super();
		this.name = name;
		this.address = address;
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

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
}
