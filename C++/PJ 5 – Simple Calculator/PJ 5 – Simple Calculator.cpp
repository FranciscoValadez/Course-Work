// Author:  Francisco Valadez
// Date:    11/6/2020
// Purpose: CS116-PJ5: This program is a simple calculator that adds, subtracts, multiplies, divides, to the power,
//or modulus of 2 numbers based on what the user inputs.

#include <iostream>//access output stream
#include <math.h> //access to math operators
using namespace std; //access to cout, and cin

void totalOut(double N1, char opera, double N2);//Prototype for function to be called later

int main() //main body, program starts here
{
	//declaration of variables
	int i = 1;
	double N1, N2;
	char opera;

	//Welcom message is displayed on program launch
	cout << "Welcome to the Simple Calculator of Francisco Valadez!";
	
	do
	{
		cout << "\n" << i << "================================================.";
		cout << "\nPlease enter your number, operator, and number > ";
		//Gets the users input, N1 is a number, opera is the operator, and N2 is a number
		cin >> N1;
		cin >> opera;
		cin >> N2;

		//This checks if the user wants to Exit the program
		if (opera != '@')
			totalOut(N1, opera, N2);
		//If the user wants to exit the goodbye message is printed
		else
		{
			cout << "Thank you for using the Simple Calculator of Francisco Valadez!";
			cout << "\n" << ++i << "================================================.\n";
		}
		++i;
	} while (opera != '@'); //Exits the loop if the user inputs '@' into the opera variable
	
	return 0;
}//end of main

void totalOut(double N1, char opera, double N2) // This function prints out the results for the calculator
{
	//These if statements check what kind of operator the user iputed and perfoms either addition, subrtraction
	//multiplication, division, power, or modulus, if none of these operations are selected it notifys the user
	
	//Addition
	if (opera == '+')
		cout << "Result: " << N1 << " " << opera << " " << N2 << " = " << N1 + N2;
	//Subtraction
	else if (opera == '-')
		cout << "Result: " << N1 << " " << opera << " " << N2 << " = " << N1 - N2;
	//Multiplication
	else if (opera == '*')
		cout << "Result: " << N1 << " " << opera << " " << N2 << " = " << N1 * N2;
	//Division
	else if (opera == '/')
		//checks if N2 is zero since dividing by zero will cause an error
		if (N2 == 0)
			cout << "The second number cannot be zero.";
		//proceeds with division if N2 is not zero
		else
			cout << "Result: " << N1 << " " << opera << " " << N2 << " = " << N1 / N2;
	//Power
	else if (opera == '^')
		cout << "Results: " << N1 << " " << opera << " " << N2 << " = " << pow(N1, N2);
	//Modulus
	else if (opera == '%')
		//checks if N2 is not zero since dividing by zero will cause an error
		if (N2 != 0)
			cout << "Result: " << N1 << " " << opera << " " << N2 << " = " << int(N1) % int(N2);
		//Prints out an error if N2 is Zero
		else
			cout << "The second number cannot be zero.";
	//Prints an error message if the opera variable contains something else
	else
		cout << "Sorry, the operator " << opera << " is not valid!";
}//end of totalOut
