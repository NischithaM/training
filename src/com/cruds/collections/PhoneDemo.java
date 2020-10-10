package com.cruds.collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class PhoneDemo {

	public static void main(String[] args) {
		Map<String,String> phone=new HashMap<String, String>();
		
		phone.put("9686114757","guru");
		phone.put("9611750444","poorna");
	
		try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("phone.ser"));)
		{
			os.writeObject(phone);
			System.out.println("successful save!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
