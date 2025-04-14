package com;

import java.io.Serializable;

import style3_programming.EmployeeValidation;

public class Book implements Serializable
{
	private String title;
	private String author;
	private int cost;
	private int noOfPages;
	private int bookId;
	
	public Book(){}

	public Book(String title, String author, int cost, int noOfPages, int bookId) 
	{
		this.title = title;
		this.author = author;
		this.cost = cost;
		boolean bookNoOfPagesValidationStatus = BookNoOfPagesValidationClass.bookNoOfPagesValidation(noOfPages);
		if(bookNoOfPagesValidationStatus)
		{
			this.noOfPages = noOfPages;
		}
		else
		{
			throw new InavalidNoOfPagesException();
		}
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public void display()
	{
		System.out.println("Book title :"+getTitle());
		System.out.println("Book Author :"+getAuthor());
		System.out.println("Book Cost :"+getCost());
		System.out.println("Book No of pages :"+getNoOfPages());
		System.out.println("Book Id :"+getBookId());
		System.out.println("-----------------------------------");
	}

	@Override
	public String toString() {
		return "Book \n title=" + title + "\n author=" + author + "\n cost=" + cost + "\n noOfPages=" + noOfPages
				+ "\n bookId=" + bookId + "\n";
	}
	
}
