package com.cruds.training;

import java.io.Serializable;

import com.cruds.exception.SMSException;

public class Student implements Serializable ,Comparable<Student>
{

	private int rollno;//instance variable
	private String name;
	private String branch;
	
	private Address address;//compare or has a relationship
	
	
	
	
	public Student(int rollno, String name, String branch) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.branch = branch;
	}



	public Student(int rollno,String name ) throws SMSException
	{
		if(rollno<=0)
		{
			throw new SMSException("ivalid roll no cant be zero or negative"+rollno);
		}
		this.rollno=rollno;
		if(name == null || name.trim().equals(""))
		{
			throw new SMSException("name cant be null or empty");
		}
		this.name=name;
		//System.out.println("2 arg construcor");
	}
	
	
	
	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		//this.branch = branch;
		this.address = address;
	}



	public void setRollno(int rollno)//roll no:local variable and mutator method
	{
		this.rollno=rollno;
	}
	
	public int getRollno()// accessor method
	{
		return rollno;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	
	{
		return name;
	}
	public void setbranch(String branch)
	{
		this.branch=branch;
	}
	public String getbranch()
	{
		return branch;
	}
	
	/*public Student(int rollno ,String name,String branch)
	{
		this(rollno,name);
		this.branch=branch;
		//System.out.println("3 arg construcor");
	}
	*/
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public void printDetails()
	{
		System.out.println("roll no:"+ rollno + "name :"+name +"branch:" +branch);
	}

	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}



@Override
public int compareTo(Student o) {
	
	//return o.getRollno()-this.rollno;
	return this.rollno-o.getRollno();
}


	
}
