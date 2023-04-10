package com.Array;
abstract class Fruit{
	abstract void eat();
	Fruit()
	{
		System.out.println("I am default constructor");
	}
}


public class Test {

	public static void main(String[] args) {
		Fruit f=new Fruit()
				{
			void eat()
			{
				System.out.println("Fruit is apple");
			}
			
				};
				f.eat();

	}

}
