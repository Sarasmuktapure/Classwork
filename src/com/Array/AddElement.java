package com.Array;

public class AddElement 
{
	public static void insert(int arr[],int index,int value,int size)
	{
		
		for(int i=size-1;i>=index;i--)
		{
			     arr[i+1]=arr[i];
		}
		arr[index]=value;
		size++;
		
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
}

	public static void main(String[] args) 
	{
		int arr[]= {1,2,4,5,6,0};
		insert(arr,2,3,5);
		
		

	}

}
