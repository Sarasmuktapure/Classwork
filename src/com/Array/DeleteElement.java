package com.Array;

import java.util.Scanner;

public class DeleteElement 
{
	public static void delete(int arr[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index you want to delete");
		int index=sc.nextInt();
		int i;
		int size=arr.length;
	    for( i=index;i<size-1;i++)
		{
			arr[i]=arr[i+1];
			
		}
		size--;
		for( i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
}


	public static void main(String[] args)
	{
        int arr[]= {3,6,7,8,9};
		
		delete(arr);
	

	}

}
