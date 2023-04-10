package com.Array;

public class Book 
{

	private int bId;
	private String bName;
	private String AuthorName;
	private int price;
	
	public Book(int bId, String bName, String authorName, int price) {
		super();
		this.bId = bId;
		this.bName = bName;
		AuthorName = authorName;
		this.price = price;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", AuthorName=" + AuthorName + ", price=" + price + "]";
	}
	
	
	
	
	

}
