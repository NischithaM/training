package com.cruds.training;

public class Address {
	
	private int id;
	private String line;
	private String city;
	private String pin;
	public Address(String line, String city, String pin) {
		super();
		this.line = line;
		this.city = city;
		this.pin = pin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pincode) {
		this.pin = pincode;
	}
	@Override
	public String toString() {
		return "Address [line=" + line + ", city=" + city + ", pincode=" + pin + "]";
	}
	
	

}
