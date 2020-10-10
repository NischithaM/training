package com.cruds.training;

public abstract class School 
{

	int educationfee;
	int organizationfee;
	
	School(int edufee,int orgfee)
	{
		this.educationfee=edufee;
		this.organizationfee=orgfee;
		System.out.println("inside school constructor");
	}
	
	
	public abstract int totalfee();

}
