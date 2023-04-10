package com.String;

public class Concat
{
   public static void concat(String s1)
	{
		
		int len1=s1.length();
		int i;
		String s2=" language";
		int len2=s2.length();
		char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        char arr3[]=new char[len1+len2];
        
        for( i=0;i<len1;i++)
    	{
    		arr3[i]=arr1[i];
    	}
    	//System.out.println(i);
    	int k=0;
    	
    	for(int j=i;j<arr3.length && k<len2 ;j++)
    	{
    		
    		arr3[j]=arr2[k];
    		k++;
    	}
    	String s3=new String(arr3);
    	System.out.println(s3);
  }

	public static void main(String[] args) 
	{
		String s1="java";
		Concat c=new Concat ();
		concat(s1);
		

	}

}
