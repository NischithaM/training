package com.cruds.training;

public class Testcounter
{
	public static void main(String[] args)
	{
	Counter c1=new Counter();
	Counter c2=new Counter();
	
	c1=null;
	c2=null;
	
	System.gc();//garbage collection
	
	//finalize is used for garbage collection to reclaim the objeatcs created .but it wont work as in the form of expected results.
	
	
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	// here collecor will get less time ,so produces expected op evry time we run
}
}
