package com.cruds.training;

import com.cruds.db.StudentDAO;
import com.cruds.exception.SMSException;

public class Teststudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Student s1=null;
		try {
			s1 = new Student(1,"");
			s1.printDetails();
		} catch (SMSException e) 
		{
			
			System.out.println(e.getInfo());
		}
		//s1.setRollno(101);
		//s1.setName("nischitha");

		//System.out.println(s1.getRollno());
		//System.out.println(s1.getName());
		
		System.out.println(s1);*/
		
		Address ad=new Address("hr layout", "banglore", "555555");
		
		Student s=new Student(222, "nischith", ad);
		
		
		StudentDAO dao=new StudentDAO();
		dao.create(s);
	}

}
