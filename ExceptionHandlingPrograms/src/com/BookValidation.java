package com;

public class BookValidation {
	
	public static boolean isFiveDigit(int bookId)
	{
		int condition1Status =0;
		int count =0;
		int temp = bookId;
		while(temp!=0)
		{
			count++;
			temp = temp/10;
		}
		if (count == 5)
		{
			condition1Status = 1;
		}
		if(condition1Status == 1)
			return true;
		else
			return false; 
	}
		public static boolean validateTitle(String bookTitle)
		{
			if (bookTitle.equalsIgnoreCase("Java")||bookTitle.equalsIgnoreCase("Python")||bookTitle.equalsIgnoreCase("Web"))
			{
				return true;
			}
			else
				return false;
		}
		public static boolean validateAuthor(String bookAuthor)
		{
			if (bookAuthor.equalsIgnoreCase("James")||bookAuthor.equalsIgnoreCase("Scott")||bookAuthor.equalsIgnoreCase("Richi"))
			{
				return true;
			}
			else
				return false;
		}
		public static boolean validateCost(int cost)
		{
			if (cost>500 && cost<=2500)
			{
				return true;
			}
			else
				return false;
		}
		public static boolean validateNoOfPages(int noOfPages)
		{
			if (noOfPages>300 && noOfPages<=1500)
			{
				return true;
			}
			else
				return false;
		}
}
