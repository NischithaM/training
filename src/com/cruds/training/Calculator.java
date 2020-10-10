package com.cruds.training;

public class Calculator 
{
	public int divide(int x,int y)
	{
//		System.out.println("before division");
//		int result=x/y;
//		System.out.println("after division");
//		return result;
		
		int result=0;
		int nums[]=new int[3];
		Student s=null;
		try
		{
			System.out.println(s.getRollno());
			nums[3]=99;
			System.out.println("before division");
			result=x/y;
			System.out.println("after division");
			
		}
//		catch(NullPointerException e)
//		{
//			System.out.println("not initialized :" +e.getMessage());
//		}
//		
		catch(ArithmeticException e)
		{
			System.out.println("invalid divisor , cant be zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("invalid index :"+e.getMessage());
		}
		
		/*catch(NullPointerException e)// this should also be present at last to follow specific to generic rule, 
		//if not will get error as unreeache code for other exceptions
		{
			System.out.println(e.getMessage());
		}
		return result;
		*/
		
		finally
	
		{
			System.out.println("inside finally block");
			nums[4]=100;
			System.out.println("inside finally block line 2");
		}
		return result;
	}
	
}
