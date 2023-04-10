package com.Array;

public class Student 
{
	private int id;
	private String name;
	private String contact_no;
	private String email;
	public Student(int id, String name, String contact_no, String email) {
		super();
		this.id = id;
		this.name = name;
		this.contact_no = contact_no;
		this.email = email;
	}
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
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", contact_no=" + contact_no + ", email=" + email + "]";
//	}
	
	

}



