package com.Array;

public class OuterClass
{
	
		int num1=10;
		class InnerDemo{
			int num2=30;
		}
		class InnerDemo2{
			int num3=20;
		}
	

	public static void main(String[] args) 
	{
		OuterClass oc =new OuterClass();
		OuterClass.InnerDemo Id1=oc.new InnerDemo();
		OuterClass.InnerDemo2 Id2=oc.new InnerDemo2();
		System.out.println(Id1.num2+Id2.num3+oc.num1);
		
	}

}
