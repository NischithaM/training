package com.cruds.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx {

	public static void main(String[] args) {
		try (DataInputStream dis=new DataInputStream(new FileInputStream("data.DAT"));)
		{
			System.out.println(dis.readDouble());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		

	}

}
