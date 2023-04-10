package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray 
{
	public static void merge(int a1[],int a2[])
	{
		int size3=a1.length+a2.length;
		int a3[]=new int [size3];
		int pos=0;
		for(int i=0;i<a1.length;i++)
		{
			a3[pos]=a1[i];
			pos++;
		}
		for(int j=0;j<a2.length;j++)
		{
			a3[pos]=a2[j];
			pos++;
		}
		System.out.println(Arrays.toString(a3));
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array1");
		int size1=sc.nextInt();
		int a1[]=new int[size1];
		System.out.println("Enter the size of array2");
		int size2=sc.nextInt();
		int a2[]=new int[size2];
		
		System.out.println("Enter array1 elements");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter array2 elements");
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=sc.nextInt();
		}
		merge(a1,a2);
		
		

	}

}
