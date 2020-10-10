package com.cruds.training;

public class Constcalldemo
{

	public static void main(String[] args) {
		
		A3 a=new A3(10);
	}
}

class A1
{
	A1()
	{
		System.out.println("inside a1 constructor");
	}
	
	A1(int a)
	{
		
		System.out.println("a1 constructor " +a);
	}
}


class A2 extends A1
{
	A2()
	{
		
		System.out.println("inside a2 constructor");
	}
	
	A2(int a)
	{
		super(1000);
		System.out.println("a2 constructor " +a);
	}
}

class A3 extends A2
{
	A3()
	{
		
		System.out.println("inside a3 constructor");
	}
	
	A3(int a)
	{
		super(100);
		System.out.println("a3 constructor " +a);
	}
}