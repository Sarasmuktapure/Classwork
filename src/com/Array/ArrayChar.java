package com.Array;

public class ArrayChar {

	public static void main(String[] args)
	{
char ch[]={'a','b','c','d','z'};//replace c d e g 
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='z')
			{
				System.out.println((char)(ch[i]-24));
			}
			else
			{
			System.out.print((char)(ch[i]+2));
			}
		
		}
		

	}

}
