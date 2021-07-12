// Author:  Francisco Valadez
// Date:    10/5/2020
// Purpose: CS116-PJ1: Check whether the year (entered by the user) is a leap year or not.                     
#include <iostream>	    // Access output stream
using namespace std;    // Access cout, endl, cin
bool IsLeapYear(int);	// Prototype for function to be defined later	
int main() // main program starts here:
{
	int n = 1; // line number for separator line ================
			   // to make the output look really nice and organized  
	cout << "Welcome to the Leap Year Check Tool of Francisco Valadez!" << endl;
	// <-- must use your name
	int the_year;		// Year to be checked
	while (true)        // Forever loop until break is hit  
	{ // begin while (true)
		cout << n++ << "=======================================================." << endl;
		cout << "Please enter a year AD (for example: 1997, -100 to exit): "
			<< endl;  		// Prompt for input from user
		cin >> the_year;   	// Read year as input 
		if (the_year == -100) break; // exit the loop if year is -100
		if (IsLeapYear(the_year))    // call function to check for leap year
			cout << the_year << " is a leap year." << endl;
		else // NOT a leap year
			cout << the_year << " is NOT a leap year." << endl;
	} // end while (true)
	cout << n++ << "=======================================================." << endl;
	cout << "Thank you for using the Leap Year Check Tool of Francisco Valadez!" << endl;
	// <-- must use your name
	cout << n++ << "=======================================================." << endl << endl;
	cout << "Press Ctrl+Alt+PrntScrn to copy console, then enter a number to exit" << endl;
	cin >> n; // get n and exit 
	return 0; // Indicates successful completion of main()
} // end main ( )
bool IsLeapYear(int year) // check year is a leap year or not
// IsLeapYear function returns true if year is a leap year and
// returns false otherwise.
{ // begin IsLeapYear( )
	if (year % 4 != 0)        // Is year not divisible by 4?
		return false;         // If so, it is not a leap year
	else if (year % 100 != 0) // Is year not a multiple of 100?
		return true;        // If so, it is a leap year
	else if (year % 400 != 0) // Is year not a multiple of 400?
		return false;	  // If so, it is not a leap year
	else
		return true;        // Is a leap year indeed
} // end IsLeapYear( )