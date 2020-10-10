package com.cruds.training;

public class Cat extends Animal
{
	
	public Cat()
	{
		super();// inherits animal class constructor
		System.out.println("inside cat class");
	}
  public void talk() {
	
	 super.talk();
	 System.out.println("mewow");

}
  
  public void eat()
	{
		System.out.println(" fish ");
	}
}
