package com.cruds.ui;

import java.util.List;
import java.util.Scanner;

import com.cruds.db.BookDAO;
import com.cruds.training.Book;


public class BookManagement {

	public static void main(String[] args) {
		String choice="";
		BookDAO dao=new BookDAO();
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("enter your choice");
			System.out.println("1. add Book details.");
			System.out.println("2. search book details by book_title.");
			System.out.println("3. list all book details.");
			System.out.println("4. delete book detail by book_id.");
			System.out.println("5. exit.");
			
			
			choice=sc.nextLine();
			
			switch (choice) {
			case "1": System.out.println("enter Book_id");
					  int book_id=sc.nextInt();
					  sc.nextLine();//dummy read to exhaust \r\f
					  System.out.println("enter book_title");
					  String book_title=sc.nextLine();
					  System.out.println("enter book_price");
					  float book_price=sc.nextFloat();
					  sc.nextLine();
					
					  Book b1=new Book(book_id, book_title, book_price);
					  if(dao.create(b1))
					  {
						  System.out.println("book record created successfully");
					  }
				
					  break;
			 
			case "2":
					  System.out.println("enter student book_title");
					  String searchbook_title=sc.nextLine();
					  
					  List<Book> listresult = dao.getBook(searchbook_title);
					  
					  if(listresult.size() > 0)
					  {
							System.out.println("========= book_id =========== book_title ======== book_price==========");
							
							for(Book book:listresult)
							{
								//System.out.println(listresult);
								System.out.println(book.getBookno() +"\t\t" +book.getBookname() + "\t\t" +book.getBook_price());
							}
							
						  
					  }
					  else
					  {
						  System.out.println("No books found");
					  }
				
				break;
				
			case "3":
						List<Book> list=dao.getAllBooks();
						System.out.println("========= book_id =========== book_title ======== book_price==========");
						
						for(Book book:list)
						{
							System.out.println(book.getBookno() +"\t\t" +book.getBookname() + "\t\t" +book.getBook_price());
						}
						break;

            case "4":
            		  System.out.println("enter book_id");
            		  int deletebook_id=sc.nextInt();
            		  sc.nextLine();
            		  
            		  if(dao.delete(deletebook_id))
            		  {
            			  System.out.println("details deletd successfully");
            		  }
				
				break;
				
            case "5": System.out.println("thank you!! exiting application");
				
					  break;


			default:System.out.println("invalid choice");
				break;
			}
			
		}
		while(!choice.equals("5"));
		sc.close();

	}

}
