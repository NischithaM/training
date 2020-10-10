package com.cruds.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// interface           //implementation
		List<String> names=new LinkedList<>();
		names.add("sada");
		names.add("rada");
		names.add("daya");
		names.add("dhanu");
		names.add(1,"sanya");//positional insert
		
		System.out.println("positional access:  " + names.get(3));
		
		
		System.out.println("iterator ");
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/*System.out.println("enhanced for loop");
		
		for(String s : names)
		{
			System.out.println(s);
		}
		
		System.out.println("normal for loop");
		
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		
		 */
	}

}
