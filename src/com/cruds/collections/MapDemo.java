package com.cruds.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> studentmap=new HashMap<>();
		studentmap.put(101, "nischitha");
		studentmap.put(101, "rada");// if we provide same key for 2 values, oldder value will get overriden by new value
		System.out.println(studentmap.get(101));
		System.out.println(studentmap.get(102));// if key not present we will get null
		
		studentmap.put(201, "nischi");
		studentmap.put(202, "nischith");
		studentmap.put(203, "nithya");
		
	Set<Integer> keys= studentmap.keySet();// keys belong to set , no duplicate values
	for(int i : keys)
	{
		System.out.println(i);
	}
	
	Collection<String> names=studentmap.values();//names belong to collections,duplicates are allowed
	for(String s:names)
	{
		System.out.println(s);
	}
	
	Set<Entry<Integer,String>> entries = studentmap.entrySet(); 
	
	for(Entry<Integer,String> e : entries)
	{
		System.out.println(e.getKey() + ":" +e.getValue());
	}
	// entry is single key,value pair , entries is collection of entries. 
	
	}

}
