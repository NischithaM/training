package com.cruds.collections;

import java.util.Set;
import java.util.TreeSet;

public class BookTreeSet {

	public static void main(String[] args) {
		
		//Set<Book> bookset=new TreeSet<>();//while calling comaparable
		Set<Book> bookset=new TreeSet<>(new BookNameComparator());//while calling comparator
		bookset.add(new Book("A passage to India", 1000));
		bookset.add(new Book("Beloved", 1000));
		bookset.add(new Book("The great Gatsby", 3000));
		bookset.add(new Book("Beloved", 500));
		bookset.add(new Book("the top ten", 800));
		
		for(Book b:bookset)
		{
			System.out.println(b);
		}
		
		
	}
}
