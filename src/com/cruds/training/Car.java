package com.cruds.training;

public class Car implements IVehicle
{

	@Override
	public void start() {
		System.out.println("car starts");
		
	}

	@Override
	public void stop() {
		System.out.println("car stops");
		
	}

	
}
