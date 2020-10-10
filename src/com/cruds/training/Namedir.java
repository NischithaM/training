package com.cruds.training;

import java.util.Scanner;

public class Namedir 
{

	public static void main(String[] args)
	{
		String[] names=new String[20];
		int top=0;
				String choice="";
				Scanner sc=new Scanner(System.in);
				
				do
				{
					System.out.println("please select choice");
					System.out.println("1.add names");
					System.out.println("2.display names");
					System.out.println("3. search name");
					System.out.println("4. delete name");
					System.out.println("5. exit");
					
					choice=sc.nextLine();
					System.out.println(choice);
					
					switch(choice)
					{
					case "1" : System.out.println("enter name");
							   String name=sc.nextLine();
							   names[top]=name;
							   top++;
							   break;
					case "2" : System.out.println("display names");
								for(int i=0;i<top;i++)
								{
									System.out.println(names[i]);
								}
								break;
					case "3" : System.out.println("search name");
					           String searchname=sc.nextLine();
					           boolean found=false;
					           for(int i=0;i<top;i++)
					           {
					        	   if(searchname.equals(names[i]))
					        	   {
					        		   found=true;
					        		   break;
					        		   
					        	   }
					           }  
					        	   if(found)
					        	   {
					        		   System.out.println("name " + searchname+" found");
					        	   }
					        	   else
					        	   {
					        		   System.out.println("name " + searchname+" not found");
					        	   }
					        	   
					          
					           break;
					case "4" : System.out.println("delete name");
							   String delname=sc.nextLine();
							   boolean found1=false;
							   for(int i=0;i<top;i++)
							   {
								   if(delname.equals(names[i]))
								   {
									   found1=true;
									   names[i]="\0";
									   
									   break;
									  
								   }
							   }
							   if(found1)
							   {
								   System.out.println(" name " + delname + "deleted");
							   }
							   else
							   {
								   System.out.println(" name " + delname + " not deleted");   
							   }
							  break;
							 
					case "5" : System.out.println("exit");
								break;
					 default:   System.out.println("invalid choice");
					 break;
						     
					}
				}
				
				while(!choice.equals("5"));
				sc.close();
	}
}
