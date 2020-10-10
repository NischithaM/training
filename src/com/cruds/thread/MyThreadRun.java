package com.cruds.thread;

public class MyThreadRun implements Runnable {

	Thread t;
	
	 public MyThreadRun(String name)
	{
		t=new Thread(this,name);
	}
	@Override
	public void run()
	{
	
		System.out.println("inside child thread " +Thread.currentThread());//points to current thread local variable
		
		for(int i=5;i>0;i--)
		{
			System.out.println(Thread.currentThread()+" " +  i);
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
		System.out.println("child thread exiting "+Thread.currentThread());
	}

}
