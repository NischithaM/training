package com.cruds.training;

public class Rectangle extends Figure
{

	Rectangle(double dim1,double dim2)
	{
		super(dim1,dim2);
		System.out.println("inside rectangle constructor");
		
	}


	@Override
	public double area() {
		return dim1 * dim2;
	}
	
	
	
	
	
}
