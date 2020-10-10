package com.cruds.training;

public class InheritanceDemo 
{
	public static void main(String[] args) {
		
		Z z= new Z();
	}
	
	
}

class X
{
	X()
	{
		System.out.println("inside x constructor");
	}
}

class Y extends X
{
	Y()
	{
		System.out.println("inside y constructor");
	}
}

class Z extends Y
{
	Z()
	{
		System.out.println("inside z constructor");
	}
}