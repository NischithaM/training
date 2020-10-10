package com.cruds.db;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.cruds.training.Student;

public class TestStudentDAO {

	/*@Test
	@Ignore
	public void test() {
		StudentDAO dao=new StudentDAO();
		Student s=new Student(11,"anil");
		assertTrue(dao.create(s));
	}
	
	@Test
	@Ignore
	public void TestGetAllStudents()
	{
		StudentDAO dao=new StudentDAO();
		List<Student> list=dao.getAllStudents();
		assertTrue(list.size()>0);
	}
	
	@Test
	@Ignore
	public void Testgetstudent()
	{
		StudentDAO dao=new StudentDAO();
		assertNotNull(dao.getStudent(11));
	
	}
	
	@Test
	@Ignore
	public void Testdelete()
	{
		StudentDAO dao=new StudentDAO();
		assertNotNull(dao.delete(11));
	}
	
	
	@Test
	public void TestUpdate()
	{
		StudentDAO dao=new StudentDAO();
		Student s=new Student(12, "anusha");
		assertNotNull(dao.Update(s));
	}
	*/
	
	@Test //creation , deletion , display all in one fn
	public void testcreate()
	{
		StudentDAO dao=new StudentDAO();
		Student s=new Student(112,"anil");
		assertTrue(dao.create(s));
		Student result=dao.getStudent(112);
	    assertNotNull(result);
	    assertEquals("anil", result.getName());
	    assertTrue(dao.delete(112));
	    
	}
	
	

}
