package com.cruds.training;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("Hello" +name);
		sc.close();

	}

}
