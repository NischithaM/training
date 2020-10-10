package com.cruds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cruds.training.Book;


public class BookDAO
{
	public boolean create(Book b)
	{
		String sql="insert into book(book_id,book_title,book_price) values(?,?,?)";
		int rows=0;
		
		try(Connection con=DBConnectionManager.getConnection())
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,b.getBookno());
			ps.setString(2, b.getBookname());
			ps.setFloat(3, b.getBook_price());
			
			rows=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows>0;
	}
	
	public List<Book> getBook(String book_name)
	{
		book_name = "%" + book_name + "%";
		String sql="select book_id,book_title,book_price from book where book_title like ?";
		List<Book> list= new ArrayList<Book>();
		
		Book b=null;
		
		try(Connection con=DBConnectionManager.getConnection())
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,book_name);
			ResultSet rs=ps.executeQuery();
			
			while(rs!= null && rs.next())
			{
				b=new Book(rs.getInt(1), rs.getString(2),rs.getFloat(3));
				list.add(b);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	
	}
	public List<Book> getAllBooks()
	{
		String sql="select book_id,book_title,book_price from book ";
		List<Book> list=new ArrayList<Book>();
		
		Book b=null;
		
		try(Connection con=DBConnectionManager.getConnection())
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs!= null && rs.next())
			{
				b=new Book(rs.getInt(1), rs.getString(2),rs.getFloat(3));
				list.add(b);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public boolean delete(int book_id)
	{
		String sql="delete from book where book_id=?";
		int rows=0;
		
		try(Connection con=DBConnectionManager.getConnection())
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, book_id);
			rows=ps.executeUpdate();
			 
		}
			catch(SQLException e)
		{
				e.printStackTrace();
		}
		
		return rows>0;
	}
	
	public boolean Update(Book b)
	{
		String sql="update book set book_price=? where book_id=?";
		int rows=0;
		
		try(Connection con=DBConnectionManager.getConnection())
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setFloat(1,b.getBook_price());
			ps.setInt(2, b.getBookno());
			
			rows=ps.executeUpdate();
			 
		}
			catch(SQLException e)
		{
				e.printStackTrace();
		}
		
		return rows>0;
	}
	
	
}
