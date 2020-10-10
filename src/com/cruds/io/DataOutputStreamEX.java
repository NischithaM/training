package com.cruds.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEX {

	public static void main(String[] args) {
	
		//try with resources
		try (DataOutputStream dos= new DataOutputStream(new FileOutputStream("data.DAT")))
		{
			
			dos.writeDouble(99.99);
			dos.writeFloat(1);
			dos.writeUTF("rada");
			System.out.println("data written successfully");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
	}

}
