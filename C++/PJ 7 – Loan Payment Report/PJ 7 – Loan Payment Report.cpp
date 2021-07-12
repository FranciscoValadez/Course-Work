// Author:  Francisco Valadez
// Date:    11/18/2020
// Purpose: CS116-PJ7: This program is a displays a loan payment report. There is a fixed apr and payment amount
// The user must input the recurring monthly payment and the program will display each month's payment

#include <iostream>		// access to output stream
#include <math.h>		// access to math operators
#include <iomanip>
using namespace std;	// access to cout cin

int main()
{
	//Variable declaration
	double loanAmount, annualIntPercent, anunalInt, monthlyPay;
	double intPaid = 0, debtPaid = 0, loanBalance, finalPay;
	double monthlyInt, totalInt;
	int month = 1; // month count starts with 1
	annualIntPercent = 18.00;  // annual interest percent is 18%
	anunalInt = annualIntPercent / 100;  // example: 18.00 now becomes 0.18 
	monthlyInt = anunalInt / 12;  // Monthly interest is annual divided by 12 months
	loanAmount = 1000.0; // Loan amount
	totalInt = 0; //Total Amount of Interest Paid. Accumulate interest of all months.
	loanBalance = loanAmount; // Initial loan balance

	//Welcome message
	cout << "Welcome to use the Loan Payment Report of Francisco Valadez!\n"
		<< "Please enter monthly payment amount (e.g.  50, 100, 180) > ";
	
	cin >> monthlyPay;  // get monthly payment
	cout << endl; // blank line before the actual report
	
	//Prints out the headline
	cout << "Month\t" << "Month-Payment\t" << "Interest-Paid\t" << "Debt-Paid\t" << "Loan-Balance\n"
		 << "-----\t" << "-------------\t" << "-------------\t" << "---------\t" << "------------";

	while (loanBalance >= monthlyPay)
	{
		//Calculates the Payments and Loan

		intPaid = loanBalance * monthlyInt;
		debtPaid = monthlyPay - (loanAmount * monthlyInt);
		loanBalance -= debtPaid;
		loanAmount = loanBalance;

		cout << endl << month << "\t"; // tab control is better for column alignment
		cout << fixed << showpoint << setprecision(2);
		cout << "$" << monthlyPay << "\t\t" << "$" << intPaid << "\t\t";
		cout << "$" << debtPaid << "\t\t" << "$" << loanBalance;
		month++; // continue to the next month's payment

		//calculates the total interest
		totalInt += intPaid;

		//Checks if the loan is below 10 cents and also calculates the final payment
		if ((loanBalance == 0) || (loanBalance <= .10))
			break;
		else if (loanBalance < monthlyPay)
		{
			intPaid = loanBalance * monthlyInt;
			monthlyPay = loanBalance + intPaid;
			debtPaid = monthlyPay - (loanAmount * monthlyInt);
			loanBalance -= debtPaid;
			loanAmount = loanBalance;

			cout << endl << month << "\t"; // tab control is better for column alignment
			cout << fixed << showpoint << setprecision(2);
			cout << "$" << monthlyPay << "\t\t" << "$" << intPaid << "\t\t";
			cout << "$" << debtPaid << "\t\t" << "$" << loanBalance;
			//calculates the total interest
			totalInt += intPaid;
		}
		
	}

	// The goodbye message and also displays the total interest paid.
	cout << "\n\nTotal Amount of Interest Pain = $" << totalInt <<
		"\nThank you for using this Loan Payment Report of Francisco Valadez!\n\n";

} // End of main()
