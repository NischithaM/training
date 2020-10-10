package com.cruds.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.cruds.training.Student;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) {
			
		Student s1= new Student(101, "rada");
		try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("student.ser"));)
		{
			os.writeObject(s1);
			System.out.println("successful save!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
