package com.prowings.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.prowings.BMW_Car;
import com.prowings.Vehicle;

public class InheritanceInDeserialization {

	public static void main(String[] args) {

		Vehicle vehicle = null;
		BMW_Car car = null;

		try (FileInputStream fileIn = new FileInputStream("vehicle.txt");
				ObjectInputStream in = new ObjectInputStream(fileIn)) {
//			vehicle = (Vehicle) in.readObject();
			car = (BMW_Car) in.readObject();
			System.out.println("Deserialized data successfully");
//			System.out.println("Deserialized Vehicle : " + vehicle);
			System.out.println("Deserialized Car : " + car);
			System.out.println(">>>>>>>> chasis number from deserialized car : "+car.getChasisNumber());
			System.out.println(">>>>>>>> chasis number from deserialized car : "+car.getVehiCletype());
			System.out.println(">>>>>>>> chasis number from deserialized car : "+car.getNumberOfWheels());

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
