/**
 * File Name: SavingsCalculator.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 30, 2016
 */
package com.sqa.am;

import java.util.Scanner;

import com.sqa.am.util.helper.SavingsCalculationHelper;

/**
 * SavingsCalculator //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Musick, Annette
 * @version 1.0.0
 * @since 1.0
 */
public class SavingsCalculator {

	static String accountName;

	static double calculatePayments;

	static double compoundInterest;

	static double compoundInterestPercent;

	static double endingBalance;

	static double initialAmount;

	static double monthlyDeposits;

	static double monthlyInterest;

	static double numofYears;

	static Scanner scanner = new Scanner(System.in);

	static String userName;

	public static void main(String[] args) {
		welcomeUser();
		while (requestToContinue()) {
			requestValuesFromUser();
			// Main area where I will change code
			calculatePayments();
			displayPayments();
		}
		farewellUser();
	}

	/**
	 *
	 */
	private static void calculatePayments() {
		System.out.println("*Calculate Payments:\n-----------------------");
		// This can not be calculated as it changes ever month based on new
		// account balance
		// monthlyInterest = (compoundInterestPercent / 100) / 12;
		// Will use my heloer method to calculate ending balance
		endingBalance = SavingsCalculationHelper.calculateCumulativeTotalCompoundedMonthly(initialAmount,
				monthlyDeposits, compoundInterest, (int) (numofYears * 12));

	}

	/**
	 *
	 */
	private static void displayPayments() {
		// No need to give a monthly break down of savings (too difficult to
		// calculate)
		// System.out.println("Your total savings extra per month for, " +
		// accountName + " are: " + savingsExtraPerMonth
		// + " " + userName + ".");
		// savingsExtraPerMonth = (initialAmount * monthlyInterest) +
		// initialAmount;
		String endingBalanceFormatted = String.format("$%,.2f", endingBalance);

		System.out.println("Your ending balance for, " + accountName + " would be: " + endingBalanceFormatted
				+ " after " + numofYears + " years, " + userName + ".");
	}

	/**
	 *
	 */
	private static void farewellUser() {
		System.out.println("Thank you for using the Savings Calculator " + userName + "!");
		scanner.close();
	}

	/**
	 *
	 */
	private static boolean requestToContinue() {
		System.out.println("*Request to Continue:\n----------------------");
		while (true) {
			System.out.println("Would you like to calculate savings?");
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Y")) {
				return true;
			} else if (input.equalsIgnoreCase("No") || input.equalsIgnoreCase("N")) {
				return false;
			} else {
				System.out.println("Invalid option (" + input + "), please use Yes/Y or No/N.");
			}
		}
	}

	/**
	 *
	 */
	private static void requestValuesFromUser() {
		System.out.println("*Request Values:\n----------------------");
		System.out.println("What is the name of the account you wish to calculate?");
		String input = scanner.nextLine();
		accountName = input;
		System.out.println("How much do you currently have in your savings account?");
		input = scanner.nextLine();
		initialAmount = Double.parseDouble(input);
		System.out.println("What will be your monthly deposits into your account?");
		input = scanner.nextLine();
		monthlyDeposits = Double.parseDouble(input);
		System.out.println("What is " + accountName + "'s annually compounded interest rate?");
		input = scanner.nextLine();
		compoundInterestPercent = Double.parseDouble(input);
		System.out.println("How many years would you like to calculate?");
		input = scanner.nextLine();
		numofYears = Double.parseDouble(input);
	}

	/**
	 *
	 */
	private static void welcomeUser() {
		System.out.println("Welcome to the Savings Calculator!");
		System.out.println("May I please have your name?");
		userName = scanner.nextLine();
	}
}
