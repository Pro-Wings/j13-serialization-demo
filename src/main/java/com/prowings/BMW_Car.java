package com.prowings;

import java.io.Serializable;

public class BMW_Car extends Vehicle implements Serializable{
	
	int numberOfGears;
	int speed;
	String type;
	
//	public BMW_Car() {
//		super();
//	}
	
	public BMW_Car(int numberOfGears, int speed, String type, int chasisNumber, String vehicleType, int numberOfWheels) {
		super(chasisNumber, vehicleType, numberOfWheels);
		this.numberOfGears = numberOfGears;
		this.speed = speed;
		this.type = type;
	}
	public int getNumberOfGears() {
		return numberOfGears;
	}
	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "BMW_Car [numberOfGears=" + numberOfGears + ", speed=" + speed + ", type=" + type + "]";
	}
	
	

}
