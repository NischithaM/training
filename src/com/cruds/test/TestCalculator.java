package com.cruds.test;

import com.cruds.training.Calculator;

public class TestCalculator 
{
	public static void main(String[] args) 
	{
		int result=0;
		
		Calculator c=new Calculator();
	  System.out.println("before calculation");
	  try
	  {
	   result=c.divide(10,0);
	  
	  }
	  catch(Exception e)
	  {
		  System.out.println("message"+e.getMessage());
	  }
	  System.out.println("after calculation");
	  System.out.println("result :" + result);
	}
}
