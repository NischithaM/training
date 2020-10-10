package com.cruds.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.cruds.training.Student;

public class SetDemo {

	public static void main(String[] args) {
		/*Set<String> names= new HashSet<>();//hashset is used for faster insert and extraction .it dsnt maintain order
		names.add("sada");
		names.add("rada");
		names.add("aadya");
		names.add("sada");//duplicates or not allowed and also wont show exception ,just ignores it
		names.add("sandya");
		for(String s:names)
		{
			System.out.println(s);
		}
		
		
		*/
/*//		Set<String> name=new LinkedHashSet<>();// to maintain order
//		name.add("sada");
//		name.add("rada");
//		name.add("aadya");
//		name.add("sada");
//		for(String s:name)
//		{
//			System.out.println(s);
//		}
//		
//		Set<String> name1=new TreeSet<>();// to print in alphabetic  order
//		name1.add("sada");
//		name1.add("rada");
//		name1.add("aadya");
//		name1.add("sada");
//		for(String s:name1)
//		{
//			System.out.println(s);
		}
		*/
		/*Set<Student> students=new HashSet<>();
		students.add(new Student(101, "sada"));
		students.add(new Student(102, "rada"));
		students.add(new Student(103, "sandya"));
		
		for(Student s:students)
		{
			s.printDetails();
		}*/
		
		/*Set<Student> students=new TreeSet<>();
		students.add(new Student(101, "sada"));
		students.add(new Student(102, "rada"));
		students.add(new Student(103, "sandya"));
		
		for(Student s:students)
		{
			s.printDetails();
		}*/
		
		Set<Student> students=new TreeSet<>(new StudentNameComparator());
		students.add(new Student(101, "sada"));
		students.add(new Student(102, "rada"));
		students.add(new Student(103, "sandya"));
		
		for(Student s:students)//diff btw comparable and comparator is imp
		{
			s.printDetails();
		}
		
	}

}
