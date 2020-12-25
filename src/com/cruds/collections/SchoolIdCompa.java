package com.cruds.collections;

import java.util.Comparator;

//comparator is used when we dont have access to school class.
public class SchoolIdCompa implements Comparator<School> {

	@Override
	public int compare(School o1, School o2) {
		System.out.println("o1 is "+ o1.getId() +"compared with" +o2.getId());
		return o1.getId() - o2.getId();//internally calls compareto method and return integer according to result.
	}

	

}
