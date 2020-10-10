package com.cruds.thread;

public class MyThread extends Thread
{
	public MyThread(String name)
	{
		System.out.println(Thread.currentThread()+ " Constructor of main thread");
		setName(name);
		//start();
		
	}
	
	@Override
	public void run() {
	System.out.println("inside child thread " +this);//points to current thread local variable
	
	for(int i=5;i>0;i--)
	{
		System.out.println(this.getName() +  i);
	try {
		Thread.sleep(250);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	}
	System.out.println("child thread exiting "+this);
	}
}
