package com.cruds.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new FileReader("States.txt")))
		{
			String  line= br.readLine();
			while(line !=null)
			{
				System.out.println(line);
				line=br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

//note : local variables will be stored in thread stack so should initialize it always. but instance variables will be in heap.
//so it is not mandatory to initialize