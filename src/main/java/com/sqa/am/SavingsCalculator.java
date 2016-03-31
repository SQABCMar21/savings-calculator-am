/**
 * File Name: SavingsCalculator.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 30, 2016
 */
package com.sqa.am;

import java.util.Scanner;

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

	static String userName;

	static int initialAmount;

	static int monthlyInterest;

	static int terminYears;

	static double compoundInterestPercent;

	static double monthlyPayments;

	static double calculatePayments;

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		welcomeUser();
		initialAmount();
		monthlyPayments();
		compoundInterestRate();
		terminYears();
		calculatePayments();
		farewellUser();
	}

	/**
	 *
	 */
	private static void calculatePayments() {
		System.out.println("*Calculate Payments:\n-----------------------");
	}

	/**
	 *
	 */
	private static void compoundInterestRate() {
		System.out.println("*Compound Interest Rate:\n-----------------------");
	}

	/**
	 *
	 */
	private static void farewellUser() {
		System.out.println("Thank you for using the Savings Calculator" + userName + "!");
	}

	/**
	 *
	 */
	private static void initialAmount() {
		System.out.println("*Initial Amount:\n-----------------------");
	}

	/**
	 *
	 */
	private static void monthlyPayments() {
		System.out.println("*Monthly Payments:\n-----------------------");
	}

	/**
	 *
	 */
	private static void terminYears() {
		System.out.println("*Term in Years:\n-----------------------");
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
