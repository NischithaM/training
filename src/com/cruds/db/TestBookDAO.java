package com.cruds.db;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.cruds.training.Book;

public class TestBookDAO 
{

	@Test
	
	public void test() {
		BookDAO dao=new BookDAO();
		Book b=new Book(3,"anuradha",300);
		assertTrue(dao.create(b));
	}
	
	@Test
	
	public void TestgetBook()
	{
		BookDAO dao=new BookDAO();
		List<Book> list=dao.getBook("malgudi days");
		assertTrue(list.size()>0);
	}
	
	@Test
	
	public void TestGetAllStudents()
	{
		BookDAO dao=new BookDAO();
		List<Book> list=dao.getAllBooks();
		assertTrue(list.size()>0);
	}
	
	@Test
	
	public void Testdelete()
	{
		BookDAO dao=new BookDAO();
		assertNotNull(dao.delete(3));
	}
	
	@Test
	public void TestUpdate()
	{
		BookDAO dao=new BookDAO();
		Book b=new Book(2,"a summer story", 550);
		assertNotNull(dao.Update(b));
	}
}
