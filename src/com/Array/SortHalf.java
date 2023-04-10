package com.Array;

import java.util.Scanner;

public class SortHalf {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[20];
		int size,i,j,k,temp,mid;
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		System.out.println("Enter the elements:");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		mid=size/2;
		for (i = 0; i < mid; i++)
		{
            for (j = i+1; j < mid; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
		}
		System.out.println(i);
		
		for (i = mid; i < size; i++) 
        {
            for (j = i ; j < size; j++) 
            {
                if (arr[i] < arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		
		System.out.println("Sorted Arrays:");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
	

	}

}
