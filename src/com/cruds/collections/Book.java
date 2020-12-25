package com.cruds.collections;

public class Book implements Comparable<Book> {

	private String book_title;
	private float price;
	
	public Book(String book_title, float price) {
		super();
		this.book_title = book_title;
		this.price = price;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [book_title=" + book_title + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book o) {
		
		return (int) (this.getPrice()-o.getPrice());
	}
	
	
}
