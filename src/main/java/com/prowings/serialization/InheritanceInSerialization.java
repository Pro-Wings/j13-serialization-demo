package com.prowings.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.prowings.BMW_Car;
import com.prowings.Vehicle;

public class InheritanceInSerialization {
	
	public static void main(String[] args) {
		
//		Vehicle vehicle = new Vehicle(1111, "Car", 4);
		BMW_Car car = new BMW_Car(6, 300, "SUV", 2323, "CAR", 4);
		
		try (FileOutputStream fileOut = new FileOutputStream("vehicle.txt");
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
//			out.writeObject(vehicle);
			out.writeObject(car);
			System.out.println(">>>>>>>> chasis number :"+car.getChasisNumber());
			System.out.println(">>>>>>>> vehicleType :"+car.getVehiCletype());
			System.out.println(">>>>>>>> number of wheels :"+car.getNumberOfWheels());
			System.out.println("Serialized data is saved in vehicle.txt");

		} catch (FileNotFoundException e) {
			System.out.println("file not found!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("some exception occurred while writing the object to file!!!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Some Exception occurred!!");
			e.printStackTrace();
		}

		
	}

}
