package com.cruds.training;

public class Testfigure
{

	public static void main(String[] args)
	{
		Rectangle r= new Rectangle(10.0,20.0);
		System.out.println("area of rectangle is : " + r.area());
		
		Triangle t=new Triangle(20,20);
		System.out.println("area of triangle is : " +t.area());
	}
}
