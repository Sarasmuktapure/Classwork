package com.Array;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) 
	{
		MovieTheatre t[]=new MovieTheatre[2];
		Scanner sc=new Scanner(System.in);
		
		
		
		for(int i=0;i<t.length;i++)
		{
			System.out.println("Enter theatre id");
			int id=sc.nextInt();
			System.out.println("Enter theatre name");
			String name=sc.next();
			System.out.println("Enter Movie name");
			String m_name=sc.next();
			System.out.println("Enter Movie rating");
			float rating=sc.nextFloat();
			
			
			
			t[i]=new MovieTheatre();
			t[i].settId(id);
			t[i].settName(name);
			Movie m=new Movie();
			
			t[i].setM(m);
			
			t[i].getM().setMname(m_name);
			t[i].getM().setRating(rating);
			}
		
		for(int i=0;i<t.length;i++)
		{
			
			System.out.println(t[i].gettId()+" "+t[i].gettName()+" "+t[i].getM().getMame()+" "+t[i].getM().getRating());
		}

	}
		
	}


