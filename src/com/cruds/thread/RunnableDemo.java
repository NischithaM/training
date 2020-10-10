package com.cruds.thread;

public class RunnableDemo {

	public static void main(String[] args) {
		System.out.println("inside main thread");
		
		MyThread t=new MyThread("child1");
		t.start();
		
		MyThreadRun rt=new MyThreadRun("runnable child1");
		rt.t.start();
		
		try {
			t.join();
			rt.t.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("main thread exits");
		
	}

}
