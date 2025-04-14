package com;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library l = new Library();
		boolean start=true;
		while(start==true)
		{
			System.out.println("Enter your choice : \n1.Add Book \n2.Display Book \n3.Search Book by id \n4.Search Book by author \n5.Update Cost \n6.Remove book \n7.Exit" );
			System.out.println("Enter a choice:");
			int ch = sc.nextInt();
			switch (ch) 
			{
			case 1: 
			{
				System.out.println("Enter Book title :");
				String title = sc.next();
				System.out.println("Enter Book Author :");
				String author = sc.next();
				System.out.println("Enter Book Cost :");
				int cost = sc.nextInt();
				System.out.println("Enter Book No of pages :");
				int noOfPages = sc.nextInt();
				System.out.println("Enter Book Id :");
				int bookId = sc.nextInt();
				l.addBook(new Book(title, author, cost, noOfPages, bookId));
			}
			break;
			case 2: 
			{
				l.displayBook();
			}
			break;
			case 3: 
			{
				System.out.println("Enter Book Id:");
				int bookId = sc.nextInt();
				l.searchBook(bookId);
			}
			break;
			case 4: 
			{
				System.out.println("Enter Book Author :");
				String author = sc.next();
				l.searchBook(author);
			}
			break;
			case 5: 
			{
				System.out.println("Enter Book Id:");
				int bookId = sc.nextInt();
				System.out.println("Enter the new cost:");
				int newCost = sc.nextInt();
				l.updateCost(bookId, newCost);
			}
			break;
			case 6: 
			{
				System.out.println("Enter Book Id:");
				int bookId = sc.nextInt();
				l.removeBook(bookId);
			}
			break;
			case 7: 
			{
				System.out.println("Thank you!!");
				start=false;
			}
			break;
			default:
				System.out.println("Enter a valid choice");
			}
		}
	}
}
