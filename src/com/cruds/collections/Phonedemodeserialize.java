package com.cruds.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.cruds.training.Student;



public class Phonedemodeserialize
{
	public static void main(String[] args) {
		Map<String,String> phonedirctory= new HashMap<>();
		phonedirctory.put("9686114757", "guru");
		try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("phone.ser"));)
		{
			os.writeObject(phonedirctory);
			System.out.println("successful save!!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
/*try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("phone.ser"));)
{
	os.writeObject(phonedirctory);
	System.out.println("successful save!!");
} catch (IOException e) {
	e.printStackTrace();
}*/