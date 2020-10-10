package com.cruds.training;

public class Exceptionquiz3 {

	public static void main(String[] args) {
		
		try
		{
		int i=Integer.parseInt(args[0]);//run config and input
		System.out.println(i);
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("invalid input :" +e.getMessage());
		}
		
		catch(RuntimeException e)//specific to generic ,if not unreachable code error occurs.
		{
			System.out.println("");//should not leave emmpty catch block ,in least case should have e.printstackTrace(); in it.
		}
		
		
	}

}
