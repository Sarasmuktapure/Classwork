package com.Array;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) 
	{
		int a[]= {1,5,8,14,20,23};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element you want to find index");
		int num=sc.nextInt();
		int index=0;
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				index=i;
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Entered element is at "+index+ " index");
		}
		else
		{
			System.out.println("Entered element is not present");
		}
	
	
		
		

}
}