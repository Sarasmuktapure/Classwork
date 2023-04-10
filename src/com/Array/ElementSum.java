package com.Array;
//sum of 1st and last sum of 2nd and 2nd last and so on
public class ElementSum {

	public static void main(String[] args) 
	{

		int arr[]= {1,2,3,4,5,6};
		int sum=0;
		
		
		for(int i=0;i<arr.length/2;i++)
		{
	        sum=arr[i]+arr[arr.length-1-i];
		    System.out.println(sum);
		}
		

	}

}
