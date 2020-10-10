package com.cruds.training;

public class Truck implements Ivehicle2
{

	@Override
	public void start()
	{
	System.out.println("truck starts");	
		
	}

	@Override
	public void stop() {
		System.out.println("truck stops");
		
	}

	@Override
	public void brake() {
		System.out.println("truck apply brake");
		
	}

}
