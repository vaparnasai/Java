package com;

public class Book {
	public String bookId ;
	public String bookTitle;
	public String bookAuthor;
	public int cost;
	public int noOfPages;
	
	public Book(String bookId,String bookTitle,String bookAuthor,int cost,int noOfPages)
	{
		boolean bookIdStatus = BookValidation.isFiveDigit( bookId);
		   if (bookIdStatus) 
		   {
			 this.bookId = bookId;
		   }
		   else
		   {
			 throw new IdOutOfBoundsException();
		   }	
	   
		boolean bookTitleStatus = BookValidation.validateTitle(bookTitle);
			if (bookTitleStatus) 
			 {
					 this.bookTitle = bookTitle;			   
			 }
		   else
    		{
	     		 throw new TitleMismatchException();
			}
			boolean bookAuthorStatus = BookValidation.validateAuthor(bookAuthor);
			if (bookAuthorStatus) 
			 {
					 this.bookAuthor = bookAuthor;			   
			 }
		   else
    		{
	     		 throw new InvalidAuthorException();
			}
			boolean costStatus = BookValidation.validateCost(cost);
			if (costStatus) 
			 {
					 this.cost = cost;			   
			 }
		   else
    		{
	     		 throw new CostOutOfBounds();
			}
			boolean noOfPagesStatus = BookValidation.validateNoOfPages(noOfPages);
			if (noOfPagesStatus) 
			 {
					 this.noOfPages = noOfPages;			   
			 }
		   else
    		{
	     		 throw new InvalidNoOfPagesException();
			}
			displayBookDetails();
	}
		
		public void displayBookDetails() {

			System.out.println("BookId is: "+ bookId);
			System.out.println("Book Title is : "+ bookTitle);
			System.out.println("Author is : "+ bookAuthor);
			System.out.println("Cost is : "+ cost);
			System.out.println("No. of Pages is : "+ noOfPages);
			System.out.println("********************************************");


	}
}
