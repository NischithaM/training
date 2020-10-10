package com.cruds.training;

public class Vehicleprovider 
{

	
	public static IVehicle getVehicle(String type)
	{
		if(type.equals(IVehicle.TYPE_LUXURY))
		{
			return new Car();
		}
		
		else if(type.equals(IVehicle.TYPE_PASSENGER))
		{
			return new Bus();
		}
		else if(type.equals(IVehicle.TYPE_HEAVYDUTY))
		{
			return new Truck();
		}
		else if(type.equals(IVehicle.TYPE_FAITHFULL))
		{
			return new Dog();
		}
		else
		{
			return null;
		}
	}
}
