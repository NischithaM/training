package com.cruds.collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties prop=new Properties();//both key and values are of string type.
		//if keys contain space,will get null as output
		prop.put("karnataka", "banglore");//keys should not contain spaces,values can
	    prop.put("tamilnadu", "chennai");
	    
	    System.out.println(prop.getProperty("karnataka"));
	    System.out.println(prop.getProperty("mh","not found"));
	    // if the key is not present ,will get null instead we can print not found as msg.
	    
	    try {
			prop.store(new FileOutputStream("capital.properties"),"states and capital");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
