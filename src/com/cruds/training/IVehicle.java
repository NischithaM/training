package com.cruds.training;

public interface IVehicle
{

	public static final String TYPE_LUXURY="L";// by default variables are public static final
	String TYPE_PASSENGER="P";
	String TYPE_FAITHFULL="F";
	String TYPE_HEAVYDUTY="H";
	
	public abstract void start();// by default methods are public abstract
	
	public void stop();
	
}
