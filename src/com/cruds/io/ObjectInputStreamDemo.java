package com.cruds.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.cruds.training.Student;

public class ObjectInputStreamDemo {

	public static void main(String[] args) {
		
		try(ObjectInputStream oi= new ObjectInputStream(new FileInputStream("student.ser"));)
		{
			
			Student s= (Student) oi.readObject();
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
