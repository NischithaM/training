package com.cruds.training;

public class AnimalProvider 
{

	public static Animal getAnimal(String type)
	{
		if(type.equals("faithful"))
		{
			return new Dog();
		}
		
		else if(type.equals("cunning"))
		{
			return new Cat();
		}
		else
		{
			return null;
		}
		
		
	}
}
