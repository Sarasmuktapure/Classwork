package com.Array;

import java.util.Scanner;


class Customer
{
	private int id;
	private String name;
	private float balance;
	
	
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

    public void setBalance(float balance) {
		this.balance=balance;
	}
    
	
}

public class Paytm 
{
	
    private float bill;
	private Customer cust;
	
	public void setBill(float bill)
	{
		this.bill=bill;
	}
	public float getBill()
	{
		return bill;
	}
	
	public void  setCustomer(Customer cust)
	{
		this.cust=cust;
	}
	public Customer getCustomer()
	{
		return cust;
	}
	public static void main(String[] args) 
	{
		Paytm p =new Paytm();
		
		p.setBill(4000);
		p.setCustomer(new Customer());
		p.getCustomer().setId(1);
		p.getCustomer().setName("Aditya");
		p.getCustomer().setBalance(20000);
		System.out.println(p.getCustomer().getBalance()-p.getBill());
		
		
	}
}
