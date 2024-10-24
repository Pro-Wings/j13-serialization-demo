package com.prowings;

public class Vehicle {

	int chasisNumber;
	String vehiCletype;
	int numberOfWheels;

	public Vehicle() {
		super();
		System.out.println("no-arg constructor of Vehicle invoked!!");
	}

	public Vehicle(int chasisNumber, String vehiCletype, int numberOfWheels) {
		super();
		this.chasisNumber = chasisNumber;
		this.vehiCletype = vehiCletype;
		this.numberOfWheels = numberOfWheels;
	}

	public int getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(int chasisNumber) {
		this.chasisNumber = chasisNumber;
	}


	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getVehiCletype() {
		return vehiCletype;
	}

	public void setVehiCletype(String vehiCletype) {
		this.vehiCletype = vehiCletype;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNumber=" + chasisNumber + ", vehiCletype=" + vehiCletype + ", numberOfWheels="
				+ numberOfWheels + "]";
	}


}
