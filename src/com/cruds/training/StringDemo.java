package com.cruds.training;

public class StringDemo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		char c[]={'a','b','c'};
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append(c));
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		

	}

}
