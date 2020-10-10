package com.cruds.collections;

import java.util.Comparator;

import com.cruds.training.Student;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		
		return arg0.getName().compareTo(arg1.getName());
	}

}
