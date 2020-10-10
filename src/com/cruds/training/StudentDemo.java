package com.cruds.training;

import com.cruds.exception.SMSException;

public class StudentDemo 
{
public static void main(String args[]) throws SMSException
{
	Student[] students=new Student[5];
	
	Student s1=new Student(101,"sada");
	students[0]=s1;
	
	Student s2=new Student(102,"rada");
	students[1]=s2;
	
	for(Student s: students)
	{
		if(s!=null)
			s.printDetails();
	}
}
	
}
