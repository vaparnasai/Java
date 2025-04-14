package com.myLibrary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Library implements Serializable
{
	private Book b;
	
	ArrayList<Book> book = new ArrayList<Book>();
	
	public void addBook(Book b)
	{
		this.b=b;
		book.add(b);
		System.out.println("Book is added Successfully...");
	}
	public void displayBook()
	{
		if(book.isEmpty())
		{
			System.out.println("Books are not present");
		}
		else
		{
			b.display();
		}
	}
	public void searchBook(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("books are not present");
		}
		else
		{
			for (Book b:book)
			{
				if(b.getBookId()==id)
				{
					System.out.println(b.getTitle()+" is the book you are searching ...");
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			System.out.println("You entered the invalid book id");
		}
	}
	public void searchBook(String author)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("books are not present");
		}
		else
		{
			for (Book b:book)
			{
				if(b.getAuthor().equalsIgnoreCase(author))
				{
					System.out.println(b.getAuthor()+" is the book author you are searching ...");
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			System.out.println("You entered the invalid book author");
		}
	}
	public void updateCost(int id, int newCost)
	{
		boolean isUpdate=false;
		if(book.isEmpty())
		{
			System.out.println("books are not present");
		}
		else
		{
			for (Book b:book)
			{
				if(b.getBookId()==id)
				{
					b.setCost(newCost);
					System.out.println(b.getCost()+"is the updated cost");
					isUpdate=true;
				}
			}
		}
		if(isUpdate==false)
		{
			System.out.println("You entered the invalid book id");
		}

	}
	public void removeBook(int id)
	{
		boolean isFound=false;
		Iterator<Book> itr = book.iterator();
		if(book.isEmpty())
		{
			System.out.println("books are not present");
		}
		else
		{
			Book book = new Book();
			if(itr.hasNext())
			{
				itr.next();
				if(b.getBookId()==id)
				{
					itr.remove();
					System.out.println("The book is removed...");
				}
			}
		}
		if(isFound==false)
		{
			System.out.println("You entered the invalid book id");
		}
	}
}
