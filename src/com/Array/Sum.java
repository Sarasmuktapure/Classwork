package com.Array;
//sum of 1st and last element then 2nd and 2nd last element and so on
public class Sum {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6};
		int size=a.length;
		
		for(int i=0;i<size/2;i++)
		{
			int sum=a[i]+a[size-1-i];
			System.out.println(sum);
			
		}
		

	}

}
