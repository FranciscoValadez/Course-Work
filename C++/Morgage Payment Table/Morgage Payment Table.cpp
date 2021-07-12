// Author:  Francisco Valadez
// Date:    9/17/2020
// Purpose: CS116-PJ2: Compute 3 mortgage payments and print a table of 3 rows.

#include <iostream>   // Access output stream
#include <iomanip>      // Access manipulators
using namespace std;    // Access cout, endl, cin
// All 6 global variables here
double loan_amount = 50000.00; // No change at all in this program.
int    number_of_years = 5; // No change at all in this program.
double yearly_percent_int;  // INPUT & also for display on output
double yearly_interest;      // to be computed = yearly_percent_int / 100.   
double monthly_interest; // to be computed = yearly_interest / 12.
int    number_payments;  // to be computed = number_of_years * 12  

double getpayment(double apr) // function to compute payment for apr returns the payment value as a double
{
	double payment;
	yearly_percent_int = apr; //input parameter from the caller
	
	// Below is the all the math for calculating the payment
	yearly_interest = yearly_percent_int / 100.; // example: 0.015 , 1.50 %
	monthly_interest = yearly_interest / 12;      // 12 months per year
	number_payments = number_of_years * 12;      // 12 payments per year
	//Formula for calculating the payment
	payment = (loan_amount * pow(monthly_interest + 1, number_payments) * monthly_interest) / (pow(monthly_interest + 1, number_payments) - 1);		

	return payment;		//Returs the payment value to the main method
}

void print(double yearly_percent_int, double payment)	//This method prints out the columns and spaces them out evenly; it returns no value
{
	//declaration of variables used inside this method for testing purposes commented out because we will use the global variables instead
	/*
	double loan_amount = 5000;
	int number_of_years = 5;
	*/
	
	
	//sets any number that isnt an integer to have a hunderedth value
	cout << fixed << showpoint << setprecision(2);	
	//Prints out what the user will see and spaces it out
	cout << loan_amount << "\t" << yearly_percent_int << "\t\t\t\t\t" << number_of_years << "\t\t" << "$" << payment << "\n";	

}
int main() //main program starts here
{
	//begin main() get 3 APRs and print their payments information
	int n = 1; //line number control for line seperator ==========.
	double apr1, apr2, apr3; // 3 anual percent interest rates  // no array here
	double pay1, pay2, pay3; // 3 payments for 3 APRs           // No array here
	cout << "Welcome to the Mortgage Payment Tool of Francisco Valadez!" << endl << endl;
	cout << n++ << "=======================================================================." << endl << endl;
	cout << ">> Enter 3 Annual % Interest Rate (such as 1.5  2.75  4.50):" << endl;
	cin >> apr1 >> apr2 >> apr3;        // get 3 APR values from the user
	cout << endl << n++ << "=======================================================================." << endl;
	pay1 = getpayment(apr1); // compute payment for apr1
	pay2 = getpayment(apr2); // compute payment for apr2
	pay3 = getpayment(apr3); // compute payment for apr3
	cout << endl; // a blank line as separator
	
	// print 2 header lines of 4 columns each

	cout << "Loan Amount\tAnnual % Interest Rate\t\tNumber of Years\t\tMonthly Payment\n"
		<< "-----------\t-----------------------\t\t---------------\t\t---------------\n\n";	//Prints out the column and spaces it out evenly us \t

	print(apr1, pay1); // print row 1
	print(apr2, pay2); // print row 2
	print(apr3, pay3); // print row 3
	
	
	//Bellow was used for testing purposes as a fast way to show the ouptut before it was sent to the print method
	/*
	cout << "apr1: "	<< apr1	<< "      pay1: "	<< pay1;
	cout << "\napr2: "	<< apr2	<< "    pay2: "	<< pay2;
	cout << "\napr3: "	<< apr3	<< "    pay3: "	<< pay3;
	*/

	//The code below is the goodbye message and tells the user how to quit the program
	cout << endl; // a blank line as separator
	cout << endl << n++ << "=======================================================================." << endl;
	cout << "Thank you for using the Mortgage Payment Tool of Francisco Valadez!" << endl;
	cout << n++ << "=======================================================================." << endl << endl;
	cout << "To really quit the game, please enter a number: " << endl;
	cin >> n;	//Waits for the user's input to quit the program
	return 0;   // Indicates successful completion

} // End main()