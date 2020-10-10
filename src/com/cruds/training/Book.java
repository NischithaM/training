package com.cruds.training;

public class Book 
{

	private int book_id;
	private String book_title;
	private float book_price;
	
	public Book(int book_id, String book_title, float book_price) {
		super();
		this.book_id = book_id;
		this.book_title = book_title;
		this.book_price = book_price;
	}
	
	public float getBook_price() {
		return book_price;
	}


	public void setBook_price(float book_price) {
		this.book_price = book_price;
	}


	public void setBookno(int bookno)
	{
		this.book_id=bookno;
	}
	
	public int getBookno()
	{
		return book_id;
	}
	
	public void setBookname(String bookname)
	{
		this.book_title=bookname;
	}
	
	public String getBookname()
	{
		return book_title;
	}
	
	public void printDetails()
	{
		System.out.println("book id:"   +book_id+ "book title :"     +book_title + "book price :" +book_price);
	}

	
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_title=" + book_title + ", book_price=" + book_price + "]";
	}


	
}
