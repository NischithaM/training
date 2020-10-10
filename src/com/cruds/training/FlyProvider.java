package com.cruds.training;

public class FlyProvider
{

	public static IFly getFlyproider(String type)
	{
		if(type.equals(IFly.TYPE_BIRD))
		{
			return new Bird();
		}
		
		else if(type.equals(IFly.TYPE_PLANE))
		{
			return new Plane();
		}
		else if(type.equals(IFly.TYPE_SUPERMAN))
		{
			return new Superman();
		}
		
		else
		{
			return null;
		}
	}
}
