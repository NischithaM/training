package com.cruds.test;

import com.cruds.training.Dog;
import com.cruds.training.IVehicle;
import com.cruds.training.Vehicleprovider;

public class TestVehicle 
{
public static void main(String[] args) {
	//Car c=new Car();
	
//	IVehicle c=new Car(); // since car implements ivehicle interface , we can use interface to access car object.
//	c.start();
//	c.stop();
//	
	
	
	
//	IVehicle v=Vehicleprovider.getVehicle("LUXURY");
//	//getvehicle is static method so accessed using classname.mthod
//	if(v!= null)
//	{
//	v.start();
//	v.stop();
//	}
//	
//	if(v instanceof Dog)
//	{
//		((Dog)v).wagtail();
//	}
	
	IVehicle v=Vehicleprovider.getVehicle(IVehicle.TYPE_HEAVYDUTY);
	if(v!= null)
	{
	v.start();
	v.stop();
	}
}
}
