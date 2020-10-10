package com.cruds.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.naming.InitialContext;

import com.cruds.training.Student;

public class StudentIODemo {

	public static void main(String[] args)
	{
	try(BufferedReader br=new BufferedReader(new FileReader("studentdetails.txt")))
	{
		Student[] sarr=new Student[10];
		int top=0;
		String line=br.readLine();
		String[] individualdata=null;
		String[] data=new String[20];
		while(line !=null)
		{
			individualdata=line.split(",");
			for(int i=0;i<individualdata.length;i++)
			{
				System.out.println(individualdata[i]);
				
			}
			
			line=br.readLine();
			data[0]=individualdata[0];
			data[1]=individualdata[1];
			data[2]=individualdata[2];
			int rollno=Integer.parseInt(individualdata[0]);
			String name=individualdata[1];
			String branch=individualdata[2];
		
			Student s=new Student(rollno,name,branch);
			sarr[top]=s;
			top++;

		}
		
		
		
		for(int i=0;i<top;i++)
			{
			Student s2=sarr[i];
			//System.out.println(s2);
				if(s2 != null){
					s2.printDetails();
				}
			//top++;
			}
	
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}

}
