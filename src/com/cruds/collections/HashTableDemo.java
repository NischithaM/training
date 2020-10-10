package com.cruds.collections;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> hash=new Hashtable<>();
		
		hash.put(101, "sada");
		//hash.put(null, "anil"); hashtable doesnt support null keys
		// synchronized and thread save.
		
		System.out.println(hash.get(101));
		
		
		HashMap<Integer, String> hashmap=new HashMap<>();
		
		hashmap.put(111,"rada");
		hashmap.put(null,"radha");
		//hashmap allows null keys
		//not synchronized and not thread save.
		
		System.out.println(hashmap.get(null));
	}

}
