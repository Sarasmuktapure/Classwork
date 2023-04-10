package com.Array;

import java.util.Scanner;

public class BookCrud {

	public static void main(String[] args) 
	{
		Book b[]=new Book[10];
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		int flag=0;
		
		while(true)
		{
			System.out.println("1.Add Book");
			System.out.println("2.Update Book");
			System.out.println("3.Delete Book");
			System.out.println("4.Search");
			System.out.println("5 View");
			System.out.println("6 Exit");
			
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			int bookid,price;
			String bname,authorname;
			
			int b_id;
			
			switch(choice)
			{
			case 1:
				System.out.println("Add Book");
				System.out.println("Enter number of books");
				int a=sc.nextInt();
				for(int i=0;i<a;i++)
				{
					System.out.println("Enter book id");
					bookid=sc.nextInt();
					System.out.println("Enter book name");
					bname=sc.next();
					System.out.println("Enter author name");
					authorname=sc.next();
					System.out.println("Enter price");
					price=sc.nextInt();
					b[count]=new Book(bookid,bname,authorname,price);
					count++;
					
				}
				System.out.println("Add book succesfully");
				break;
				
				case 2:
					System.out.println("Update Book");
					System.out.println("Enetr book id you want to update");
					b_id=sc.nextInt();
					for(int i=0;i<count;i++)
					{
						if(  b[i].getbId()==b_id)
						{
							flag=1;
							System.out.println("Enter the number which thing you want to update");
							System.out.println("1. Update the price \n 2. Update the id \n 3. Update the book name \n 4. Update the author name");
							int num=sc.nextInt();
							switch(num)
							{
							case 1:System.out.println("Enter the price you want to update");
							 price=sc.nextInt();
							 b[i].setPrice(price);
							 break;
							case 2:System.out.println("Enter the id you want to update");
							 b_id=sc.nextInt();
							 b[i].setbId(b_id);
							 break;
							case 3:System.out.println("Enter the book name you want to update");
							 bname=sc.next();
							 b[i].setbName(bname);
							 break;
							case 4: System.out.println("Enter the author name you want to update");
							 authorname=sc.next();
							 b[i].setAuthorName(authorname);
							 break;
							 default:System.out.println("Invalid input");
							
							}
							
							
							
							
							 
							 
							
						}
					}
					if(flag==0)
					{
						System.out.println("book is not present");
					}
					break;
					
				case 3:	
					System.out.println("Delete Book");
					System.out.println("Enetr book id you want to delete");
					 b_id=sc.nextInt();
					 for(int i=0;i<count;i++)
						{
							if(b[i].getbId()==b_id)
							{
								flag=1;
								b[i]=null;
								System.out.println("book delete sucessfully");
							}
			}
					 
					 if(flag==0)
						{
							System.out.println("book is not present");
						}
					 break;
				case 4:System.out.println("Search book by id");
				System.out.println("Enetr book id you want to search whether it is present or not");
				 b_id=sc.nextInt();
				 for(int i=0;i<count;i++)
					{
						if(b[i].getbId()==b_id)
						{
							flag=1;
							break;
					    }
						else
						{
							flag=0;
						}
					}
				 if(flag==1)
				 {
					 System.out.println("Book is present");
				 }
				 else
				 {
					 System.out.println("Book is not present");
				 }
					
				 break;
					 
				case 5:
					System.out.println("show books");
					System.out.println(count);
					for(int i=0;i<count;i++)
					{
						if(b[i]!=null)
						{
						System.out.println(b[i]);
						}
					}
					break;
				case 6:
					System.exit(0);
					break;
		}
			
		
		
		
	}
		

	}

}
