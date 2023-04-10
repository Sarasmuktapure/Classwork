package com.Array;

import java.util.Scanner;

class CustomerDetails
 {
	 private int id;
		private String name;
		private double balance;
		
		
		public int getId() {
			return id;
		}

	    public void setId(int id) {
			this.id = id;
		}

	    public String getName() {
			return name;
		}

	    public void setName(String name) {
			this.name = name;
		}

	    public double getBalance() {
			return balance;
		}

	    public void setBalance(double balance) {
			this.balance=balance;
		}
	    
	    public String toString()
	    {
	    	return "Customer id: "+id+" "+" Customer Name: "+name+" "+" Customer Balance is:" +balance;
	    }
	 
 }
public class PaytmDemo {

	public static void main(String[] args) 
	{
		CustomerDetails cd=new CustomerDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter balance");
		double balance=sc.nextDouble();
		System.out.println("Enter shopping bill");
		double bill=sc.nextDouble();
		
		cd.setId(id);
		cd.setName(name);
		cd.setBalance(balance-bill);
		
		System.out.println(cd.toString());
	}

}








