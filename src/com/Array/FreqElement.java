package com.Array;

import java.util.Scanner;

public class FreqElement 
{
	public static void freqElement(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				System.out.println(a[i]+" "+count);
			}
		
		}
		
		}
	
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		freqElement(a);
		

	}

}
