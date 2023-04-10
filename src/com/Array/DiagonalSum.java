package com.Array;

public class DiagonalSum {

	public static void main(String[] args)
	{
		int a[][]= {{3,2,4},{5,7,8},{2,9,1}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
				
			}
		}
		System.out.println("Sum of diagonal elements are="+sum);
		

	}

}
