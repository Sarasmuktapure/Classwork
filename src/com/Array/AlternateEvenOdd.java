package com.Array;

import java.util.Arrays;

public class AlternateEvenOdd {

	public static void main(String[] args)
	{
		int arr[]= {11,13,15,17,19,12,14,16,18,20};
		
		  int cop[]=new int[10];
		  int flag=0;

		  
		  
		  for(int i=0;i<arr.length;i++)
		  {
		     for(int j=i+1;j<arr.length;j++)
		     {
		       if(arr[i]>arr[j])
		       {
		         int temp=arr[i];
		         arr[i]=arr[j];
		         arr[j]=temp;
		       }
		     }
		  }
		  System.out.println(Arrays.toString(arr));
		  
		  int x=0;
		 int y=1;
		  
		  for(int i=1;i<arr.length;i+=2)
		  {
			  cop[x]=arr[i];
			  x+=2;
		   
		  }
	for(int j=0;j<arr.length;j+=2)
	{
		  cop[y]=arr[j];
		  y+=2;
	}
	
	System.out.println(Arrays.toString(cop));
		

	}

}
