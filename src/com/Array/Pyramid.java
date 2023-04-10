package com.Array;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int rows=sc.nextInt();
		
		for(int i=1;i<rows;i++)
		{
			for(int sp=rows-1;sp>i;sp--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<2*i-1;j++)
			{
				
				System.out.print("*");
				
			}
			System.out.println("");
		}

		

	}

}
