package com.cruds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.cruds.exception.SMSException;
import com.cruds.training.Student;


public class StudentDAO 
{
	public Vector<Vector<String>> getAllStuddentsForJTable() //obtaining data from student database.
	{
		String sql="select s.roll_no,s.name ,a.line,a.city ,a.pin from student s ,address a where s.roll_no=a.roll_no";
		
		Vector<String> row=new Vector<>();
		Vector<Vector<String>> data=new Vector<>();
		
		try(Connection con=DBConnectionManager.getConnection())
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs != null && rs.next())
			{
				row=new Vector<>();
				row.add(String.valueOf(rs.getInt(1)));//jdbc indexing starts from 1 not zero. resultset is part of jdbc implementation
				row.add(rs.getString(2));
				row.add(rs.getString(3));
				row.add(rs.getString(4));
				row.add(rs.getString(5));
				
				data.add(row);
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return data;
	}
	
	public boolean create(Student s)
	{
	String sql="insert into student(roll_no,name) values(?,?)";
	String addsql="insert into address(line,city,pin,roll_no) values(?,?,?,?)";
	
	int rows=0,addrow=0;
	
	try(Connection con=DBConnectionManager.getConnection())
	{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, s.getRollno());
		ps.setString(2, s.getName());
		rows=ps.executeUpdate();
		
		ps=con.prepareStatement(addsql);
		ps.setString(1, s.getAddress().getLine());
		ps.setString(2, s.getAddress().getCity());
		ps.setString(3, s.getAddress().getPin());
		ps.setInt(4, s.getRollno());
		
		addrow=ps.executeUpdate(); 
	}
		catch(SQLException e)
	{
			e.printStackTrace();
			
			if(e.getMessage().contains("duplicate"))
			{
				throw new SMSException(s.getRollno() +"already exits ! duplicate entry !");
			}
			else
			{
				throw new SMSException(e.getMessage() +"  please contact system admin");
			}
	}
	
	return rows>0  && addrow>0;
}
	
	public Student getStudent(int rollno)
	{
		String sql="select roll_no,name from student where roll_no=?";
		Student s=null;
		
		try(Connection con=DBConnectionManager.getConnection())
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,rollno);
			
			ResultSet rs=ps.executeQuery();
			 
			 if(rs!=null && rs.next())
			 {
				 s=new Student(rs.getInt(1),rs.getString(2));
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
	
	public List<Student> getAllStudents()
	{
		String sql="select roll_no,name from student ";
		List<Student> list=new ArrayList<Student>();
		
		Student s=null;
		
		try(Connection con=DBConnectionManager.getConnection())
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs!= null && rs.next())
			{
				s=new Student(rs.getInt(1), rs.getString(2));
				list.add(s);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public boolean delete(int rollno)
	{
		String sql="delete from student where roll_no=?";
		int rows=0;
		
		try(Connection con=DBConnectionManager.getConnection())
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, rollno);
			rows=ps.executeUpdate();
			 
		}
			catch(SQLException e)
		{
				e.printStackTrace();
		}
		
		return rows>0;
	}
	
	public boolean Update(Student s)
	{
		String sql="update student set name=? where roll_no=?";
		int rows=0;
		
		try(Connection con=DBConnectionManager.getConnection())
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,s.getName());
			ps.setInt(2, s.getRollno());
			
			rows=ps.executeUpdate();
			 
		}
			catch(SQLException e)
		{
				e.printStackTrace();
		}
		
		return rows>0;
	}
}