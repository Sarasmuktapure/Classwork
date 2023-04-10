package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxRow {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row");
		int row=sc.nextInt();
		System.out.println("Enter col");
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];
		System.out.println("Enter array elements");
		
		for(int i=0;i<row;i++)
		{
			
			
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			
			
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		//int arr[][]={ {11,33,4},{34,5,6},{2,5,11}};
		
		
		for(int i=0;i<row;i++)
		{
			int max=arr[i][0];
			
			for(int j=0;j<col;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
				
			}//end of col
		   System.out.println(max);
		}
		

	}

}
