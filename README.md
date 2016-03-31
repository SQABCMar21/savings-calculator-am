##Savings Calculator Day Five

Create an application which calculates the amount of savings based on initial amount and a set of monthly deposits, given a compounded annual interest rate and a period based on an amount of years. The application should do the following steps:

Welcome the user to the application.
Ask the user what the initial amount in their savings account is.
Ask the user what the monthly set payments are (ex: 10000), the compounded interest rate (ex: 6.5), and term in years (10).
Calculate he payments based on the formula below:
double monthlyInterest = (compoundInterestPercent / 100) / 12;
double savingsExtraPerMonth =  (initialAmount * monthlyInterest) + depositAmount;
Let the user know what the balance would be at the end of each year, for the total of years requested (ex: 10).
Ask the user if they would like to find out the savings amount of a different account.
Echo a farewell message to the user.
Exit the application.

Example output:

Welcome to the Saving Calculator Application
Could I get your name? John
How much do you currently have in your savings account? 10000
What will be your monthly payments into your account? 100
What is your annually compounded interest rate? 6.5
How many years would you like to calculate? 10
Based on your input values, it seems you will have the following in your savings account within the next 10 years:

Year 1) $11,906.12
Year 2) $13,939.90
Year 3) $16,109.88
Year 4) $18,425.20
Year 5) $20,895.57
Year 6) $23,531.39
Year 7) $26,343.73
Year 8) $29,344.42
Year 9) $32,546.08
Year 10) $35,962.15

Thank you for using the Saving Calculator Application.
Have a great day, John!

--------------------------------------------------------------------------------------------

- Remember the formula for calculating the Savings account is not as important as the ability to layout the code. Try to divide your actions into method calls, you want to find the monthly interest rate as a decimal number and calculate that amount in one function, than use another function that calls that method for year containing months. An example of monthly output for year 1, would be:
Month 1) $10,154.17

Month 2) $10,309.17
Month 3) $10,465.01
Month 4) $10,621.70
Month 5) $10,779.23
Month 6) $10,937.62
Month 7) $11,096.86
Month 8) $11,256.97
Month 9) $11,417.95
Month 10) $11,579.79
Month 11) $11,742.52
Month 12) $11,906.12

You may also want to look into formating string such as the following lines do:

String output = String.format("Month %d: $%,.2f", i, balance);
System.out.println(output);

- I will post the code and methods to calculate the savings amount tomorrow, good luck at giving it a shot!
