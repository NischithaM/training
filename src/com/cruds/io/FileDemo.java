package com.cruds.io;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo {

	public static void main(String[] args) {
		File file=new File("C:\\Java\\jdk1.7.0_40");
		
		System.out.println(file.isDirectory());
		
		if(file.isDirectory())
		{
			//String[] fileslist=file.list();
			String[] fileslist=file.list(new TextFileFilter());// to print only .txt files.
			
			for(String filename:fileslist)
			{
				System.out.println(filename);
			}
		}

	}

}
