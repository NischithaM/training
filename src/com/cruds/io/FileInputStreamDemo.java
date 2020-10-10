package com.cruds.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) 
	{
		FileInputStream fis=null;
		File file=new File("C:\\Java\\jdk1.7.0_40\\README.html ");
		
		try {
			if(file.exists() && file.canRead())
			{
			fis=new FileInputStream(file);//instead of double \ slash we can use single / slash
			}
			int size=fis.available();
			System.out.println("size " +size);
			//fis.close(); if fis is open and op is read ,here close is not executed and bcms unavailable for other reader class ,so should mention in finally block
//			for(int i=0;i< size;i++)
//			{
//				System.out.print(fis.read());
//				
//			}
			for(int i=0;i< size;i++)
			{
				System.out.print((char)fis.read());
				//System.out.println("availabile \t" +fis.available());
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally
		{
			try {
				if(fis!= null)// if the file is not present ,null pointer exception arises
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
