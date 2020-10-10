package com.cruds.training;

public class Schoolfee {

	public static void main(String[] args) 
	{
	
		Normalchildern n=new Normalchildern(500,500);
		System.out.println("student fee " +n.totalfee());
		
		Specialabledchildern s=new Specialabledchildern(500,500);
		System.out.println("student fee " +s.totalfee());
		
		
	}

}
