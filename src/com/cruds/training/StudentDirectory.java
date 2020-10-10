package com.cruds.training;

import java.util.Scanner;

public class StudentDirectory {

	public static void main(String[] args) 
	{
	 Student[] sarr=new Student[20];
	 int top=0;
	 String choice="";
	 Scanner sc=new Scanner(System.in);
	 
	 do
	 {
		 System.out.println(" select choice ");
		 System.out.println("1. add details.");
		 System.out.println("2. view details.");
		 System.out.println("3. serach by name");
		 System.out.println("4.search by rollno");
		 System.out.println("5. delete name");
		 System.out.println("6. exit");
		 
		 choice=sc.nextLine();
		 System.out.println(choice);
		
		 
		 switch(choice)
		 {
		 case "1" :  System.out.println("enter rollno");
		 			int rollno=sc.nextInt();
		 			sc.nextLine();// dummy read to exhaust \r\f in scanner buffer
		 			System.out.println("enter name");
		 			String name=sc.nextLine();
		 			Student s1=new Student(rollno,name);
		 			sarr[top]=s1;
		 			top++;
		 			break;
		 			
		 case "2" : System.out.println(" view details.");
		 			for(int i=0;i<top;i++)
		 			{
		 			Student s2=sarr[i];
		 			//System.out.println(s2);
		 				if(s2 != null){
		 					s2.printDetails();
		 				}
		 			//top++;
		 			}
		 			break;
		 case "3" : System.out.println(" search by name");
		 			String searchname=sc.nextLine();
		 			boolean found=false;
		 			Student searchresult=null;
		 			for(int i=0;i<top;i++)
		 			{
		 				searchresult=sarr[i];
		 				if(searchresult.getName().equals(searchname))
		 				{
		 					found=true;
		 					break;
		 				}
		 			}
		 			
		 			if(found)
		 			{
		 				System.out.println(searchname + "found");
		 				searchresult.printDetails();
		 			}
		 			else
		 			{
		 				System.out.println(searchname + "  not found");	
		 			}
		 			break;
		 
		 case "4" : System.out.println(" search by rollno");
			        int searchrollno=sc.nextInt();
			        sc.nextLine();
			        boolean found1=false;
			        Student searchresult1=null;
			        for(int i=0;i<top;i++)
			        {
			        	searchresult1=sarr[i];
			        	if(searchresult1.getRollno() == searchrollno)
			        	{
					       found1=true;
					       break;
				         }
		         	}
			
			       if(found1)
			        {
			        	System.out.println(searchrollno + "found");
				         searchresult1.printDetails();
		     	    }
			       else
			       {
			    	   System.out.println(searchrollno + "  not found");
			       }
			       
			       break;
			       
		 case "5": System.out.println("delete name");
		           String deletename=sc.nextLine();
		           boolean found2=false;
		           Student result=null;
		           
		           for(int i=0;i<top;i++)
		           {
		        	   result=sarr[i];
		        	   if(result.getName().equals(deletename) )
		        	   {
		        		   found2=true;
		        		   sarr[i]=null;
		        		   break;
		        		   
		        	   }
		           }
		           
		           if(found2)
		           {
		        	   System.out.println(deletename + "deleted");
		     
		           }
		           else
		           {
		        	   System.out.println(deletename + "  not deleted");
		           }
		           break;
		 case "6" : System.out.println("exit");
		 			break;
		 			
		 default : System.out.println("invalid choice");
		 }
		 
	 }
	 while(!choice.equals("6"));
		sc.close();

		
		
	}

}
