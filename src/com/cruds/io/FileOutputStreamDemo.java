package com.cruds.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) 
	{	
		String msg="hello all !! welcome to java io";
		byte[] data=msg.getBytes();
	
		try {
			FileOutputStream fio= new FileOutputStream("demo.txt");
			fio.write(data);
			fio.close();
			System.out.println("data written successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
