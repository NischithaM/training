package com.cruds.training;

public class Multileveldemo2
{

	public static void main(String[] args)
	{
		printsal(new Director());
	}

    private static void printsal(Object obj)
    {
    	 if(obj instanceof Employee)
    	{
    		System.out.println(" salary 10k");
    	}
    	
    	else if(obj instanceof Manager)
    	{
    		System.out.println(" salary 50k");
    	}
    	
    	else if(obj instanceof Director)
    	{
    		System.out.println(" salary 1 lakh");
    	}
    }
}
