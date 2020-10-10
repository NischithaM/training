package com.cruds.test;

import com.cruds.training.FlyProvider;
import com.cruds.training.IFly;

public class TestFly {

	public static void main(String[] args) {
		IFly fly=FlyProvider.getFlyproider(IFly.TYPE_SUPERMAN);
		
		fly.fly();
			
			
				
			

	}

}
