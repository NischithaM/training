package com.cruds.thread;

public class Cliker implements Runnable
{

	long count;
	Thread t;
	
	private volatile boolean running= true;
	
	public Cliker(int priority)
	{
		System.out.println("constructor thread " + Thread.currentThread());
		t=new Thread(this);
		t.setPriority(priority);
		
	}
	
	
	@Override
	public void run() {
		System.out.println("run method thread " + Thread.currentThread());
		while(running)
		{
			count++;
		}
		
	}
	
	public void stop()
	{
		System.out.println("stop method  thread " + Thread.currentThread());
		running=false;
	}
}
