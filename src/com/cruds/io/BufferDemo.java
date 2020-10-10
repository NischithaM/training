package com.cruds.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferDemo {

	public static void main(String[] args) {
		try {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Java\\jdk1.7.0_40\\README.html"));
			BufferedOutputStream bos=new BufferedOutputStream(System.out);
			
			byte[] data=new byte[1024];
			int len=0;
			boolean eof=false;
			while(!eof)
			{
				len=bis.read(data);
				if(len == -1)
				{
					eof=true;
				}
				else
				{
					bos.write(data,0,len);
					//bos.flush(); if bos.close is not called output will not be printed bcz buffer will be having still empty space 
					//to get filled . flush is used to write upto len of the file.bos.close will internally have flush ,no need to cll explicity
				}
			}
			
			
			bos.close();
			bis.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}

}
