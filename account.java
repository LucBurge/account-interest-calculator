package account;

import java.util.Scanner;

public class account {

	public static void main(String[] args) {
		// interest rates
		double rateA = 1.5;
		double rateB = 2;
		double rateC = 1.5;
		double rateX = 5;
		
		// user input for savings
		Scanner money = new Scanner(System.in);
		System.out.println("Enter the amount of money you wish to save within the next year: £");
		double savings = money.nextDouble();
		
		// user input for account type
		Scanner account = new Scanner(System.in);
		System.out.println("Enter an account type (A, B, C or X): ");
		String type = account.next();
		
		// calculations for interest accrued
		double calcA = savings / 100 * rateA;
		double calcB = savings / 100 * rateB;
		double calcC = savings / 100 * rateC;
		double calcX = savings / 100 * rateX;
		
		// output for interest accrued
		switch(type) {
		case "A": case "a": 
			if(savings < 250) {
				System.out.println("Sorry, you have not met the minimum balance requirement.");
			}
			else {
				System.out.println("You would accrue £" + calcA + " interest with account A.");
			}
			break;
		case "B": case "b": 
			if(savings < 1000) {
				System.out.println("Sorry, you have not met the minimum balance requirement.");
			}
			else {
				System.out.println("You would accrue £" + calcB + " interest with account B.");
			}
			break;
		case "C": case "c": 
			if(savings < 250) {
				System.out.println("Sorry, you have not met the minimum balance requirement.");
			}
			else {
				System.out.println("You would accrue £" + calcC + " interest with account C.");
			}
		break;
		case "X": case "x": 
			if(savings < 5000) {
				System.out.println("Sorry, you have not met the minimum balance requirement.");
			}
			else {
				System.out.println("You would accrue £" + calcX + " interest with account X.");
			}
		break;			
		
		// user input error
		default: System.out.println("Error. The account you have chosen does not exist.");
		}

	}

}
