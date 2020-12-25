package com.cruds.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		
		
		//Set<School> set=new TreeSet<>();
		//Set<School> set=new TreeSet<>(new SchoolIdCompa());//using comparator as product class is not accessible for third party.
		Set<School> set=new TreeSet<>();//when implementing comparable 
		set.add(new School(1, "maruthi"));
		set.add(new School(2, "maruthi"));
		set.add(new School(3, "vidyanikethan"));
		set.add(new School(4,"vasavi"));
		
		for(School s:set)
		{
			System.out.println(s);
		}
		
	}
}
