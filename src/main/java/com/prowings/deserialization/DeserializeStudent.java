package com.prowings.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.prowings.Student;


public class DeserializeStudent {
	
	public static void main(String[] args) {
		
		//step 1 = read  the stream from file - Student.txt
		//step 2 = convert stream back to the Object of Student type
		FileInputStream fileIn = null;
		ObjectInputStream in = null;
		try {
			fileIn = new FileInputStream("student.txt");
            in = new ObjectInputStream(fileIn);
            
            Student deserializedStd = (Student) in.readObject();
            
            System.out.println("After deserializing : "+deserializedStd);
            
            
		}catch (FileNotFoundException e) {
			System.out.println("file not found!!");
			e.printStackTrace();
		}catch (IOException e) {
			
			System.out.println("some error occurred while reading the file!!");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Some error occurred!!");
			e.printStackTrace();
		}
		finally {
			try {
				fileIn.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Resources closed successfully!!");
		}

		
	}

}
