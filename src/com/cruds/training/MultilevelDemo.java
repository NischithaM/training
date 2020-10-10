package com.cruds.training;

public class MultilevelDemo 
{

	public static void main(String[] args)
	{
		printsal(new Employee());
	}

    private static void printsal(Object obj)
    {
    	if(obj instanceof Director)
    	{
    		System.out.println("salary 1lakh");
    	}
    	
    	else if(obj instanceof Manager)
    	{
    		System.out.println(" salary 50k");
    	}
    	
    	else if(obj instanceof Employee)
    	{
    		System.out.println(" salary 10k");
    	}
    }


}
