package com.Array;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) 
	{
		Student s[]=new Student[4];
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter  name ");
			String name=sc.next();
			System.out.println("Enter contact_no");
			String contact=sc.next();
			System.out.println("Enter email");
			String email=sc.next();
			
			s[i]=new Student(id,name,contact,email);
		}
		
		for(Student stud:s)
		{
			System.out.println(stud.getId()+" "+stud.getName()+" "+stud.getContact_no()+" "+stud.getEmail());
		}
		

	}

}
