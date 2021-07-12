// Author:  Francisco Valadez
// Date:    10/20/2020
// Purpose: CS116-PJ3: A game to convert temperatures between Fahrenheit and Celsius.
#include <iostream>		// Access input output stream
#include <iomanip>      	// Access manipulators
using namespace std;    	// Access cout, endl, cin

double celsius_to_f(double celsius)	//This method function holds the equation for converting celcius to F
{
	double fahrenheit;

	//The formula for converting from celsius to fahrenheit
	fahrenheit = ((9.0 / 5.0) * celsius) + 32;

	return fahrenheit; //Returns the value of fahrenheit
}

double fahrenheit_to_c(double fahrenheit)	//This method function holds the equation for converting celcius to F
{
	double celsius;
	
	//The formula for converting fahrenheit to celsius
	celsius = (5.0 / 9.0) * (fahrenheit - 32); 

	return celsius; //Returns the value of celsius
}

void print_tf(double temp_f)	//This method function prints the conversion from Fahrenheit to Celsius
{
	//The following is printed and the value of temp_f is passed to the funtion fahrenheit_to_c in order to be converted to Celsius
	cout << temp_f << " degree F = " << fahrenheit_to_c(temp_f) << " degree C.\n";
}

void print_tc(double temp_c)	//This method function prints the conversion from Celsius to Fahrenheit
{
	////The following is printed and the value of temp_c is passed to the funtion celsius_to_f in order to be converted to fahrenheit
	cout <<  temp_c << " degree C = " << celsius_to_f(temp_c) << " degree F.\n";
}

int main()
{
	int n = 1; // line number for each separation line for readability
	double tc, tf =1; // temperature C,  temperature F, double to avoid conversion warning
	cout << "Welcome to the Temperature Conversion Tool Francisco Valadez!" << endl;

	while (tf != -999)	// an infinite loop to be stopped by user's input of -999
	{ //while loop 
		cout << n++ << "=============================================================" << endl;
		cout << "Please enter a temperature in Fahrenheit: (-999 to quit) ";
		cin >> tf;		// get input for tf

		if (tf == -999) //Exits the loop when the user enter '-999' because they want to exit the program
			break;
		
		print_tf(tf);	// Prints out the temperature when converting from fahrenheit to celsius

		cout << "Please enter a temperature in Celsius: (-999 to quit)  ";
		cin >> tc;		// get input for tc 

		if (tc == -999)	//Exits the loop when the user enter '-999' because they want to exit the program
			break;

		print_tc(tc);	// Prints out the temperature when converting from celsisus to fahrenheit

	} // end of while loop
	cout << n++ << "========================================================================" << endl;
	cout << "Thank you for using the Temperature Conversion Tool of Francisco Valadez!" << endl;
	cout << n++ << "========================================================================" << endl;
	int quit; // define integer variable quit  

	cout << "To really quit this game, please enter a number: " << endl;
	cin >> quit; // get input for quit  
	return 0;	 // return zero to indicate the successful completion
} // end main ========================================================
