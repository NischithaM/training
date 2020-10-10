package com.cruds.training;

public class Dog extends Animal implements IVehicle
{

	public void talk()
	{
		System.out.println("bow wow !!");// child class overrides the parent class method by providing its own implemmentation
	}
	
	public void eat()
	{
		super.eat();
		System.out.println(" pedigree");
	}
	
	public void wagtail()
	{
		System.out.println("wag tail");
	}

	@Override
	public void start() {
		System.out.println("dog starts");
	}

	@Override
	public void stop() {
		System.out.println("dog stops");
		
	}
}
