package com.Array;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) 
	{
		int space=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int rows=sc.nextInt();
		
		space=rows-1;
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			space--;
			
			for(int j=1;j<=2*i-1;j++)
			{
				
				System.out.print("* ");
				
			}
			
				
			System.out.println("");
		}
		space=1;
		for(int i=1;i<=rows-1;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			space++;
			for(int j=1;j<=2*(rows-i)-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		

	}




		
		
		

	}


