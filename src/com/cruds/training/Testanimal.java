package com.cruds.training;

public class Testanimal {

	public static void main(String[] args)
	{
//		Animal a=new Animal();
//		a.talk();
//		
	/*	Dog d=new Dog();
		d.talk();
		
		Animal a1=new Dog();
		a1.talk(); //parent ref can be used to hold child object
		
		Animal a2=new Cat();
		a2.talk();

		
		Animal a3=AnimalProvider.getAnimal("faithful");//polymorphism one class diff behaviour
		if(a3 != null)
		{
		a3.talk();
		a3.eat();//abstraction
		
		//type casting
		if(a3 instanceof Dog)// to avoid classcastexception
		{
		((Dog)a3).wagtail();
		}
		
		*/
		
		//Cat c1= new Cat();
		
		Animal a=new Animal();
		a.eat();
		
	}

}
