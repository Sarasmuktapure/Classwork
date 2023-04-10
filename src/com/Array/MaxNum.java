package com.Array;

import java.util.Scanner;

public class MaxNum 
{
	public static void max(int arr[])
	{
		int maxnum=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maxnum)
			{
				maxnum=arr[i];
			}
		}
		System.out.println("maximum number is="+maxnum);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		max(arr);
	
		

	}

}
