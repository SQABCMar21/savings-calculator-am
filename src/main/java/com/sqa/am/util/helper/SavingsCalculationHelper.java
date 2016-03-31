/**
 *   File Name: SavingsCalculationHelper.java<br>
 *
 *   Nepton, Jean-francois<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 31, 2016
 *
 */

package com.sqa.am.util.helper;

/**
 * SavingsCalculationHelper //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 *
 */
public class SavingsCalculationHelper {

	// Calculate Yearly Total
	public static double calculateCumulativeTotalCompoundedMonthly(double baseAmount, double monthlyDepositAmount,
			double annualInterestPercent, int totalTermInMonths) {
		double balance = baseAmount;
		int curYear = 1;
		for (int curTermInMonthsForPeriod = 1; curTermInMonthsForPeriod <= totalTermInMonths; curTermInMonthsForPeriod++) {
			balance += calcInterestAndDepositsPerPeriod(balance, 100, 6.5, 12);
			if (curTermInMonthsForPeriod % 12 == 0) {
				System.out.println(String.format("Year %d: $%,.2f", curYear, balance));
				curYear++;
			}
		}
		return balance;
	}

	// Calculate interest for periods a year (12 months) plus any deposits and
	// return new balance
	private static double calcInterestAndDepositsPerPeriod(double balance, double monthlyDepositAmount,
			double annualInterestPercent, double periodsPerYear) {
		double monthlyInterest = (annualInterestPercent / 100) / periodsPerYear;
		double additionalAmount = (monthlyInterest * balance) + monthlyDepositAmount;
		return additionalAmount;
		// Cumulative total
	}
}
