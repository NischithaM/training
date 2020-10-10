package com.cruds.training;

public class exceptionquiz2
{
	public static void main(String[] args) 
	{
	
		
		try
		{
			int i=Integer.parseInt(args[0]);
			System.out.println(i);
		}	
		//System.out.println("testing");//no statment should be present bw try,catch and finally
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}
}
