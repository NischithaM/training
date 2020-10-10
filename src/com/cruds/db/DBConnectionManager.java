package com.cruds.db;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cruds.exception.SMSException;

public class DBConnectionManager 
{
	static
	{
		try
	{
		Class.forName("com.mysql.jdbc.Driver"); // class-keyword Class-package
	}
		catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	
	}
	public static Connection getConnection()
	{
		Connection con=null;
		try{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cit","root","dummy");
		}catch(SQLException e)
		{
			e.printStackTrace();
			throw new SMSException("database error ,please contact system admin");
		}
	
	return con;
	}
}
