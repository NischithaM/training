package com.cruds.collections;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		System.out.println("o1 name is :" +o1.getBook_title() +"   is compared with" + o2.getBook_title());
		return o1.getBook_title().compareTo(o2.getBook_title());
	}
	
	

}
