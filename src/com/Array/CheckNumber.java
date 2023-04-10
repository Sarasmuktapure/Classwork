package com.Array;

import java.util.Scanner;

public class CheckNumber
{
	public static void checkNumber(int a[],int num)
	{
		boolean isPresent=false;
		int i;
		for( i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				isPresent=true;
				System.out.println("Position of entered element is at "+i+ " position");
				break;
			}
		}
		if(isPresent==true)
		{
			System.out.println("Entered number is present in array");
			
		}
		else
		{
			System.out.println("Entered number is not present in array");
		}
		
		
		
			
		}
		
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to check");
		int num=sc.nextInt();
		checkNumber(a,num);
	

	}

}
