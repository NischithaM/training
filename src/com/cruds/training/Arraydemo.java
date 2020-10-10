package com.cruds.training;

import java.util.Scanner;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=sc.nextInt();
		}
		
		for(int x : nums)
		{
			System.out.println(x);
		}
		sc.close();

	}

}
