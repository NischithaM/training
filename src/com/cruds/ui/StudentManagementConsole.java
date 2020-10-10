package com.cruds.ui;

import java.util.List;
import java.util.Scanner;

import com.cruds.db.StudentDAO;
import com.cruds.training.Student;

public class StudentManagementConsole {

	public static void main(String[] args) {
	
		String choice="";
		StudentDAO dao=new StudentDAO();
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("enter your choice");
			System.out.println("1. add student details.");
			System.out.println("2. search student details by rollno.");
			System.out.println("3. list all student details.");
			System.out.println("4. delete student detail by rollno.");
			System.out.println("5. exit.");
			
			
			choice=sc.nextLine();
			
			switch (choice) {
			case "1": System.out.println("enter rollno");
					  int rollno=sc.nextInt();
					  sc.nextLine();//dummy read to exhaust \r\f
					  System.out.println("enter name");
					  String name=sc.nextLine();
					  
					  Student s1=new Student(rollno,name);
					  if(dao.create(s1))
					  {
						  System.out.println("student record created successfully");
					  }
				
					  break;
			 
			case "2":
					  System.out.println("enter student rollno");
					  int searchrollno=sc.nextInt();
					  
					  if(dao.getStudent(searchrollno) != null)
					  {
						  System.out.println("found");
					  }
					  
				
				break;
				
			case "3":
						List<Student> list=dao.getAllStudents();
						System.out.println("====== rollno =========== name ========");
						
						for(Student stud:list)
						{
							System.out.println(stud.getRollno() +"\t\t" +stud.getName());
						}
						break;

            case "4":
            		  System.out.println("enter rollno");
            		  int deleterollno=sc.nextInt();
            		  
            		  if(dao.delete(deleterollno))
            		  {
            			  System.out.println("details deletd successfully");
            		  }
				
				break;
				
            case "5": System.out.println("thank you!! exiting application");
				
					  break;


			default:
				break;
			}
			
		}
		while(!choice.equals("5"));
		sc.close();

	}

}
