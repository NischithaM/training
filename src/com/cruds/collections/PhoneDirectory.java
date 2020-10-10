package com.cruds.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory implements Serializable{

	public static void main(String[] args) {
		
		Map<String,String> phonedirctory= null;
		 String choice="";
		 Scanner sc=new Scanner(System.in);
		 try(ObjectInputStream oi= new ObjectInputStream(new FileInputStream("phone.ser"));)
			{
				
			 phonedirctory = (Map<String, String>) oi.readObject();
				
				System.out.println(phonedirctory);
			}
		 	catch(FileNotFoundException e)
		 {
		 		phonedirctory = new HashMap<String, String>();
		 }
		 	catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
				
		
		do
		{
			
			System.out.println("1.add details");
			System.out.println("2.search deatils.");
			System.out.println("3.exit");
			
			choice=sc.nextLine();
			System.out.println(choice);
			
			
			switch(choice)
			{
			
			case "1" : System.out.println("add phone number");
						String phno=sc.nextLine();
					   System.out.println("add name");
					    String name=sc.nextLine();
					   phonedirctory.put(phno, name);
					   System.out.println("added details succesfully");
					   
					   break;
			case "2" : System.out.println("enter phone no");
						String searchno=sc.nextLine();
						String result = phonedirctory.get(searchno);
						
						if(result != null)
						{
							System.out.println("deatils found");
							System.out.println(result);
						}
						else
						{
							System.out.println("not found");
						}
						
						break;
			case "3" : System.out.println("exit");
			 try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("phone.ser"));)
				{
					os.writeObject(phonedirctory);
					System.out.println("successful save!!");
				} catch (IOException e) {
					e.printStackTrace();
				}

						
			    break;
	
		     default : System.out.println("invalid choice");
			}
			
			
		}
		while(!choice.equals("3"));
		sc.close();
	}

}
