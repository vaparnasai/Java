package com;

import java.util.Scanner;

public class UserMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean start = true;
		while (start == true)
		{
			System.out.println("Enter your choice : \n1.Create Aadhar Card \n2.Create Voter Id \n3.Create Pan Card \n4.Exit");
			
			int ch = sc.nextInt();
			switch (ch)
			{
			case 1:
				AadharCard.createAadharObject();
				break;
			case 2:
				VoterId.createVoterObject();
				break;
			case 3:
				PanCard.createPanObject();
				break;
			case 4:
				System.out.println("Thank you");
				start = false;
				break;
			default:
				System.out.println("Enter valid choice....");
			}
		}
	}
}
