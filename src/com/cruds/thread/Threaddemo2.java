package com.cruds.thread;

public class Threaddemo2 {

	public static void main(String[] args)
	{
		System.out.println("inside main thread");
		
		MyThread t=new MyThread("child1");
		t.start();
//		
//		MyThread t1=new MyThread("child2");
//		t1.start();
		
		try {
			t.join();//join ensures that main thread exits after child threads execution . if not child will bcm orphan 
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		MyThread t1=new MyThread("child2");
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("exiting main thread");

		
	}

}
