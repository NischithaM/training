package com.cruds.training;

public class Counter 
{
	public static int OBJ_COUNT;
	
	public Counter()
	{
		OBJ_COUNT++;
	}
	
	@Override
	protected void finalize() throws Throwable {
		

		System.out.println("before finalize--->"+OBJ_COUNT);
		OBJ_COUNT--;
		System.out.println("after finalize--->"+OBJ_COUNT);
	}
}
