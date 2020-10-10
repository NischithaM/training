package com.cruds.training;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentIODEMO {

	public static void main(String[] args) {
		Student[] studentarray=new Student[10];
		int pos=0;
		
		try(BufferedReader br=new BufferedReader(new FileReader("studentdetails.txt")))
		{
			String line=br.readLine();
			while(line!=null)
			{
				String[] tokens=line.split(",");
				Student s=new Student(Integer.parseInt(tokens[0]),tokens[1],tokens[2]);
				studentarray[pos]=s;
				pos++;
				line=br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(Student s:studentarray)
		{
			if(s!=null)
			{
			s.printDetails();
			}
		}
	}

}
