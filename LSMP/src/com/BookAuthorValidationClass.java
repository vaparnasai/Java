package com;

public class BookAuthorValidationClass 
{
	public static boolean bookAuthorValidation(String author)
	{

			if (author.equals("office chair") || author.equals ("dinning chair") || author.equals ("reclainer chair"))
			{
				this.author = author;
			}
			else
			{
				System.err.println("Invalid chair type....");
			}
		}
	}
}
