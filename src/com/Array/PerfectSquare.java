package com.Array;

public class PerfectSquare {

	public static void main(String[] args)
	{
int arr[]= {5,3,4,25,49};
		
		/*for(int i=1;i<=7;i++)
		{
			int sq=i*i;
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==sq)
				{
					System.out.println(arr[j]);
				}
				
			}
		}*/
		
		for(int i=0;i<arr.length;i++)
		{
			double x=Math.sqrt(arr[i]);
			int res=(int) x;
			//System.out.println(res);
			int sq=res*res;
			//System.out.println(sq);
			
			
			
			if(sq==arr[i]){
				{
					System.out.println(arr[i]);
				}
			}
			
			
		}
		

	}

}
