package com.cruds.training;

public class Normalchildern extends School
{

	Normalchildern(int edufee, int orgfee)
	{
		super(edufee,orgfee);
		System.out.println("inside normalchildern class");
	}
	

	@Override
	public int totalfee() {
		return educationfee+organizationfee;
		
	}
	
}
