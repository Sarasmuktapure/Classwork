package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Search {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("Enter the array elements");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println("--------------------------------------------");
		int flag=0;
		System.out.println("Enter the element you want to search");
		int num=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("Entered element is present");
		}
		else
		{
			System.out.println("Entered element is not present");
		}
		
	

	}

}
