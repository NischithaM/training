package com.cruds.thread;

public class SyncronizationDemo 
{
	public static void main(String[] args) {
		Printer p=new Printer();
		
		User u1=new User(p,"hello");
		User u2=new User(p,"sync");
		User u3=new User(p,"world");
		
	}
}
