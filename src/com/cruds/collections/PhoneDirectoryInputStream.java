package com.cruds.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

import com.cruds.training.Student;



public class PhoneDirectoryInputStream {

	public static void main(String[] args) {
		
		try(ObjectInputStream oi= new ObjectInputStream(new FileInputStream("phone.ser"));)
		{
			
			Map<String,String> phone= (Map<String, String>) oi.readObject();
			System.out.println(phone);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
/*try(ObjectInputStream oi= new ObjectInputStream(new FileInputStream("phone.ser"));)
{

 	Map<String, String> ph=  (Map<String, String>) oi.readObject();
 	System.out.println(ph);
} catch (IOException e) {
	   e.printStackTrace();
} catch (ClassNotFoundException e) {
	   e.printStackTrace();
}*/