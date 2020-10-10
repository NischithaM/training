package com.cruds.training;

import java.util.Scanner;

public class StudentDir {

	public static void main(String[] args) 
	{
		//String[] names=new String[20];
		//String[] rollno=new String[20];
		Student[] studentArr = new Student[20];
		int top=0;
		//int pop=0;
				String choice="";
				Scanner sc=new Scanner(System.in);
				
				do
				{
					System.out.println("please select choice");
					System.out.println("1.add details");
					System.out.println("2.display details");
					System.out.println("3. search by name");
					System.out.println("4. search by rollno");
					System.out.println("5. delete deatils");
					System.out.println("6. exit");
					
					choice=sc.nextLine();
					System.out.println(choice);
					
					switch(choice)
					{
					case "1" : System.out.println("enter roll no and name");
							   
							   int rollno=sc.nextInt();
							   String name=sc.nextLine();
							  Student s1=new Student(rollno,name);
							  studentArr[top]=s1;
							  top++;
							   break;
					case "2" : System.out.println("display details");
								for(int i=0;i<top;i++)
								{
									System.out.println(studentArr[i]);
								}
								break;
					case "3" : System.out.println("search by name");
					           String searchname=sc.nextLine();
					           boolean found=false;
					           for(int i=0;i<top;i++)
					           {
					        	   if(searchname.equals(studentArr[i]))
					        	   {
					        		   found=true;
					        		   break;
					        		   
					        	   }
					           }  
					        	   if(found)
					        	   {
					        		   System.out.println("name " + searchname +" found");
					        	   }
					        	   else
					        	   {
					        		   System.out.println("name " + searchname +" not found");
					        	   }
					        	   
					          
					           break;
					case "4":System.out.println("search by rollno");
			                String searchrno=sc.nextLine();
			                boolean found1=false;
			                for(int i=0;i<top;i++)
			                {
			        	    if(searchrno.equals(studentArr[i]))
			        	     {
			        		   found1=true;
			        		   break;
			        		   
			        	      }
			               }  
			        	   if(found1)
			        	   {
			        		   System.out.println("rollno " + searchrno +" found");
			        	   }
			        	   else
			        	   {
			        		   System.out.println("rollno " + searchrno +" not found");
			        	   }
			        	   
			          
			               break;
					case "5" : System.out.println("delete deatils");
							   String delname=sc.nextLine();
							   boolean found2=false;
							   for(int i=0;i<top;i++)
							   {
								   if(delname.equals(studentArr[i]))
								   {
									  studentArr[i]=null;
									   found2=true;
									   break;
									  
								   }
							   }
							   if(found2)
							   {
								   System.out.println(" name " + delname + "  deleted");
							   }
							   else
							   {
								   System.out.println(" name " + delname + "  not deleted");   
							   }
							  break;
							 
					case "6" : System.out.println("exit");
								break;
					 default:   System.out.println("invalid choice");
					            break;
						     
					}
				}
				
				while(!choice.equals("6"));
				sc.close();
	
	}

}
