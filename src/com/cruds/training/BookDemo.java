package com.cruds.training;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) 
	{
	  
		Book[] bookarr=new Book[20];
		int top=0;
		String choice="";
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("select your choice");
			System.out.println("1. add book details.");
			System.out.println("2. view book details.");
			System.out.println("3. search book by bookno.");
			System.out.println("4. search book by bookname");
			System.out.println("5. delete book details.");
			System.out.println("6. exit");
			
			choice=sc.nextLine();
			System.out.println(choice);
			
			switch(choice)
			{
			case "1" :System.out.println("enter book no");
					  int bno=sc.nextInt();
					  sc.nextLine();
					  System.out.println("enter book name");
					  String bname=sc.nextLine();
					  Book b1=new Book(111,null,10f);
					  bookarr[top]=b1;
					  top++;
					  System.out.println("added details successfully");
					  break;
					
			case "2" :System.out.println("view details.");
			          for(int i=0;i<top;i++)
			          {
			        	  Book b2=bookarr[i];
			        	  if(b2!=null)
			        	  {
			        		  b2.printDetails();
			        	  }
			          }
			          break;
			          
			case "3" :System.out.println("enter book no");
			          int searchno=sc.nextInt();
			          sc.nextLine();
			          boolean found=false;
			          Book searchresult=null;
			          for(int i=0;i<top;i++)
			          {
			        	  searchresult=bookarr[i];
			        	  if(searchresult.getBookno() == searchno)
			        	  {
			        		  found=true;
			        		  break;
			        	  }
			          }
			          
			          if(found)
			          {
			        	  System.out.println(searchno + "found");
			        	  searchresult.printDetails();
			          }
			          else
			          {
			        	  System.out.println(searchno + "not found");
			          }
			          
			          break;
			          
			case "4" : System.out.println("enter book name");
	                   String searchname=sc.nextLine();
	                   boolean found1=false;
	                   Book searchresult1=null;
	                   for(int i=0;i<top;i++)
	                   {
	        	        searchresult1=bookarr[i];
	        	        if(searchresult1.getBookname().equals(searchname))
	        	       {
	        		     found1=true;
	        		     break;
	        	       }
	                   }
	          
	                   if(found1)
	                    {
	        	             System.out.println(searchname + "found");
	        	             searchresult1.printDetails();
	                    }
	                  else
	                   {
	        	              System.out.println(searchname + "not found");
	                   }
	          
	                 break;
	                 
			case "5" :System.out.println("enter book name");
					  String delname=sc.nextLine();
					  boolean found2=false;
					  Book deleteresult=null;
					  for(int i=0;i<top;i++)
					  {
						  deleteresult=bookarr[i];
						  if(deleteresult.getBookname().equals(delname))
						  {
							 found2=true;
							 bookarr[i]=null;
							 break;
							 
						  }
					  }
					  
					  if(found2)
					  {
						  System.out.println(delname + "deleted");
	        	            
					  }
					  else
					  {
						  System.out.println(delname + "not found");
					  }
					  break;
			case "6" :System.out.println("exit");
					  break;
					  
			default : System.out.println("invalid choice");
			}
			
			
		}
		while(!choice.equals("6"));
		sc.close();
			
		
		

	}

}
