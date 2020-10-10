package com.cruds.thread;

public class User implements Runnable
{

	Printer p;
	Thread t;
	String msg;
	
	User(Printer print, String msg)
	{
		t=new Thread(this);
		this.p=print;
		this.msg=msg;
		t.start();
	}

	@Override
	public void run()
	{
		synchronized (p) {
			p.print(msg);// when we cant change dev prg ,user can do sync by using block 
		}
		
		
	}
	
}
