package com.cruds.training;

import java.io.FileNotFoundException;

public class Exceptionquiz4 
{
	static void throwOne() throws FileNotFoundException
	{
		System.out.println("inside throwone.");
		throw new  FileNotFoundException();
	}
	public static void main(String[] args) 
	{
		try {
			throwOne();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}	
	}
}
