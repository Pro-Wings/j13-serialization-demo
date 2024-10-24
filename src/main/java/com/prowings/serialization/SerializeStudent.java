//package com.prowings.serialization;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//
//import com.prowings.Address;
//import com.prowings.Student;
//
//public class SerializeStudent {
//
//	public static void main(String[] args) {
//
//		System.out.println("main method started!!");
//		Address addr = new Address(123, "Ayodhya", "India");
//
//		Student std1 = new Student(20, "Ram", addr);
//
//		// step 1 = serialize std1
//		// step2 = store the stream into file
//		
//		try (FileOutputStream fileOut = new FileOutputStream("student.txt");
//				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
//			out.writeObject(std1);
//			System.out.println("Serialized data is saved in student.txt");
//
//		} catch (FileNotFoundException e) {
//			System.out.println("file not found!!");
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("some exception occurred while writing the object to file!!!");
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println("Some Exception occurred!!");
//			e.printStackTrace();
//		}
//
//		System.out.println("main method ended!!");
//
//	}
//
//}
