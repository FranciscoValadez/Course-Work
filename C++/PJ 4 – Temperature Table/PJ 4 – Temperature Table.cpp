// Author:  Francisco Valadez    
// Date:    11/3/2020
// Purpose: CS116-PJ4: Create a table of 7 temperatures from Fahrenheit to Celsius.
#include <iostream>	   // include library to access input output stream
#include <iomanip>      // include library to access output manipulators
using namespace std;    // Access cout, endl, cin using standard namespace

double fahrenheit_to_c(double fahrenheit); // Prototype for function to be defined later
void tempTableFormat(double celsius, double fahrenheit); // Prototype for void funtion that will print the table


int main()   // integer function main() should return integer to the caller.
{
	cout << "Welcome to the Temperature Tool of Francisco Valadez!\n" << endl << endl;
	// You must use your name here
	double tf1, tf2, tf3, tf4, tf5, tf6, tf7; // temperature F, 7 of them, don’t use float
	double tc1, tc2, tc3, tc4, tc5, tc6, tc7; // temperature C, 7 of them, don’t use float
	cout << "Please enter 7 temperatures in Fahrenheit: ";
	cin >> tf1 >> tf2 >> tf3 >> tf4 >> tf5 >> tf6 >> tf7; // get 7 input values

	// your statements here to convert all 7 F-temperatures
	// to C-temperatures, and then print a table for them.

	//Below converts the temparature from fahrenheit to celsius
	tc1 = fahrenheit_to_c(tf1);
	tc2 = fahrenheit_to_c(tf2);
	tc3 = fahrenheit_to_c(tf3);
	tc4 = fahrenheit_to_c(tf4);
	tc5 = fahrenheit_to_c(tf5);
	tc6 = fahrenheit_to_c(tf6);
	tc7 = fahrenheit_to_c(tf7);

	//Below prints the table header
	cout << "degree F"<< setw(11) << "degree C\n"
		 << "========"<< setw(11) <<"========\n";
	//Sends the user input temperature and the converted temperature to a 
	//void function so that it could be printed out and spaced out correctly
	tempTableFormat(tc1, tf1);
	tempTableFormat(tc2, tf2);
	tempTableFormat(tc3, tf3);
	tempTableFormat(tc4, tf4);
	tempTableFormat(tc5, tf5);
	tempTableFormat(tc6, tf6);
	tempTableFormat(tc7, tf7);



	cout << endl << "Thank you for using the Temperature Tool of Francisco Valadez!\n" << endl;
	int quit;  // declare integer variable quit              // You must use your name here
	cout << "To really quit this game, please enter a number: " << endl;
	cin >> quit;  // get the input 
	return 0;     // return zero to indicate a successful completion
} // end main ( ) ===========================================================

double fahrenheit_to_c(double fahrenheit)	//This method function holds the equation for converting celcius to F
{
	double celsius;

	//The formula for converting fahrenheit to celsius
	celsius = (5.0 / 9.0) * (fahrenheit - 32);

	return celsius; //Returns the value of celsius
}

void tempTableFormat(double celsius, double fahrenheit) // This method function prints out the values input and converted
{
	// The fixed modifier disables scientific notation
	cout << fixed;
	cout << setprecision(1) << setw(7) << fahrenheit  << setw(10) << celsius << "\n";
}
