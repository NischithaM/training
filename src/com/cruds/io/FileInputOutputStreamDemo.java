package com.cruds.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {

	public static void main(String[] args) 
	{
		try {
			FileInputStream fis= new FileInputStream("C:\\Java\\jdk1.7.0_40\\README.html ");
			byte[] data=new byte[fis.available()];// creating byte array of size file available
			fis.read(data);//reading from byte array upto size of fis.
			FileOutputStream fio= new FileOutputStream("demo.txt");
			fio.write(data);//writing to demo.txt from data array
			fio.close();
			fis.close();
			System.out.println("data written successfully");
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
