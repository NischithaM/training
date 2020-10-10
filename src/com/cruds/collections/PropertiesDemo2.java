package com.cruds.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {

	public static void main(String[] args) {
	
		//properties are widely used in customization.
		Properties prop =new Properties();
		try {
			prop.load(new FileInputStream("college.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("welocme to " +prop.getProperty("college_name"));
		System.out.println("best wishes from " +prop.getProperty("principal_name"));
	}

}
