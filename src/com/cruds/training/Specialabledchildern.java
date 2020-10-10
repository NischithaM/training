package com.cruds.training;

public class Specialabledchildern extends School
{

	Specialabledchildern(int edufee, int orgfee)
	{
		super(edufee,orgfee);
		System.out.println("inside specialchildern class");
	}
	

	@Override
	public int totalfee() {
		return (educationfee+organizationfee)/2;
		
	}

}
