package com.cruds.thread;

public class PriorityDemo {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY-1);
		
		Cliker high=new Cliker(Thread.NORM_PRIORITY+2);
		Cliker low=new Cliker(Thread.NORM_PRIORITY-2);
		
		low.t.start();
		high.t.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		high.stop();
		low.stop();
		
		System.out.println("high counter " + high.count);
		System.out.println("low counter " + low.count);
	}

}
