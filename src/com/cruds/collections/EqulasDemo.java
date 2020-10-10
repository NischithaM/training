package com.cruds.collections;

import com.cruds.training.Student;

public class EqulasDemo {

	public static void main(String[] args) {
		Student s1=new Student(101, "sada");
		Student s2=new Student(101, "sada");
		s1=s2;
		if(s1==s2)// == can be apllied only to primitive times such int,float , not on objects;
		{
			System.out.println("s1 and s2 objects refernces to same memory location");
		}
		
		else if(s1.equals(s2))// student class should override equals method ,if not it wont get execute
		{
			System.out.println("s1 and s2 objects conatins same contents");
		}
		else
		{
			System.out.println("none");
		}

	}

}
