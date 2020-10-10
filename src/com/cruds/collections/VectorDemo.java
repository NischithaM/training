package com.cruds.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("sada");
		v.add("anil");
		
		for(String s : v)
		{
			System.out.println(s);
		}
	}

}
