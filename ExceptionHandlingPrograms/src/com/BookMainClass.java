package com;

import java.util.Random;
import java.util.Scanner;

public class BookMainClass {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int bookId = r.nextInt(123456);
		System.out.println(bookId);
		System.out.println("Enter book title :");
		String bookTitle = sc.next();
		System.out.println("Enter book author :");
		String bookAuthor = sc.next();
		System.out.println("Enter book cost :");
		int cost = sc.nextInt();
		System.out.println("Enter book no of pages :");
		int noOfPages = sc.nextInt();
		Book b1=new Book(bookId,bookTitle,bookAuthor,cost,noOfPages);

	}
}
