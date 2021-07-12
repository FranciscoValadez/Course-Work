// Author:  Francisco Valadez
// Date:    11/30/2020
// Purpose: CS116-PJ9: This is a password game that tells the user if the password that they input is strong or weak

#include <string>		// for string processing
#include <iostream>		// Access input output stream: cin cout
using namespace std;    // Access cout, endl, cin without using std:: as prefix
// 8 global variables and 7 prototypes of functions

string pw; // global pw for the password to be checked
bool r1, r2, r3, r4, r5, r6, r7; // global 7 boolean flags for violations
void s1(); void s2(); void s3(); void s4(); void s5();
void s6(); void s7(); // 7 prototypes of functions to be defined after main() 

int main() //like a driver to call those 7 functions to check a password 
{ // begin of main // must return integer to the caller
	int i = 1;
	cout << "Welcome to the PASSWORD game designed by Francisco Valadez!" << endl;
	cout << i << "=====================================================\n";
	cout << "Please enter a password:";
	getline(cin, pw); // pw may have blanks anywhere, so must use getline( )
	cout << "Your password " << "\"" << pw << "\"";

	while (pw != "quit")  // the password is not “quit”
	{ //begin of while loop
		s1(); s2(); s3(); s4();
		s5(); s6(); s7();  // call to check all 7 rules for satisfaction/violation

		if (r1 && r2 && r3 && r4 && r5 && r6 && r7) // all 7 rules satisfied
			cout << " is very secure! Congratulations!" << endl;
		else // insecure password
		{ // begin print all the violated rules in detail ================. 
			cout << " violates the following rule(s):" << endl;
			// You must complete all the following strings 
			if (!r1) cout << "Rule 1: Length invalid - The length of the password must be 8 to 12 only.\n";
				if (!r2) cout << "Rule 2: No Space - The password must not contain any space or blank characters.\n";
					if (!r3) cout << "Rule 3: At least 2 digits - The password must contain at least 2 digit.\n ";
						if (!r4) cout << "Rule 4: At least 1 upper-case letter - The password must contain at least one upper-case letter.\n";
							if (!r5) cout << "Rule 5: At least 1 lower-case letter - The password must contain at least one lower case letter.\n";
								if (!r6) cout << "Rule 6: At least 1 special character - The password must contain at least one special character, which can\n"
									<<"be one of the following 7 choices: '$', '#', '@', '&', '*', '?', or '!'.\n";
									if (!r7) cout << "Rule 7: No special numbers - The password must not contain any of the following 4 \n"
										<< "numbers: 2020, 2019, 2018, or 2017.\n";
		} // end print all the violated rules in detail =====================.
		i++;
		cout << i << "=====================================================\n";
		cout << "Please enter a password:";
		getline(cin, pw); // pw may have blanks anywhere, so must use getline( )
		cout << "Your password \"" << pw << "\"";
	} // end of while loop ==============================================.
	
	cout << " is to quit the game." << endl;
	cout << ++i << "=====================================================\n";
	cout << "Thank you for playing the PASSWORD game designed by Francisco Valadez!\n";
	cout << ++i << "=====================================================\n";
	return 0; // return integer 0 to show the job is well done now.
} // end of main =========================================================.

void s1() //checks the length of the pasword, has to be at least 8 charachters and max 12 characters
{
	r1 = false; // assume violation of rule 1
	if (pw.length() >= 8 && pw.length() <= 12)  //checks to see if the password is the correct length
		r1 = true; // passing Rule 1 checking: at least 8 characthers and is less than 12 characters
}
void s2() // Checks if the password has any spaces
{
	r2 = false; //assusmes violation of rule 2
	char c;
	int countspace = 0; //keeps count of how many spaces there are
	string space = " ";
	for (int i = 0; i < pw.length(); i++)
	{
		c = pw.at(i); // c gets the i-th char from pw
		if (space.find(c) != string::npos) // c is a digit  
			countspace++; // increment countDigits by 1
	}
	if (countspace == 0)
		r2 = true;
}
void s3() // to check for security rule 3 to see if satisfied or not. 
		  // Set r3 to true if Rule 3 is satisfied, false otherwise 
{ // begin of s3( ) function // s3 does not return any value to the caller
	char c;
	int countDigits = 0; // count how many digits in pw. Start with zero.
	string digits = "0123456789";
	r3 = false; // assume violation of rule 3
	for (int i = 0; i < pw.length(); i++)
	{
		c = pw.at(i); // c gets the i-th char from pw
		if (digits.find(c) != string::npos) // c is a digit  
			countDigits++; // increment countDigits by 1
	}
	if (countDigits >= 2)  // more than or equal to 2 digits
		r3 = true; // passing Rule 3 checking: at least 2 digits   
} // end of s3( ) function

void s4() // checks if the password has at least 1 upper case letter
{
	char c;
	int countUpper = 0;
	string upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //upper case letters we need to find
	r4 = false; //Assusme violation of rule 4
	for (int i = 0; i < pw.length(); i++)
	{
		c = pw.at(i); // c gets the i-th char from pw
		if (upperChars.find(c) != string::npos)//keeps checking until the end of the string
			countUpper++;
	}
	if (countUpper > 0) //if one Upper case letter is found r4 is set to true
		r4 = true;
}
void s5() //Checks if the password has at least 1 lower case letter
{
	char c;
	int countLower = 0;
	string lowerChars = "abcdefghijklmnopqrstuvwxyz"; //lower case letters we need to check for
	r5 = false; //Assusme violation of rule 5
	for (int i = 0; i < pw.length(); i++)
	{
		c = pw.at(i); //c gets the i-th char from pw
		if (lowerChars.find(c) != string::npos)//keeps checking until the end of the string
			countLower++;
	}
	if (countLower > 0) //if one lower case letter is found r5 is set to true
		r5 = true;
}
void s6() //Checks if the password has at least one special character
{
	char c;
	int countSpecial = 0;
	string specialChars = "$#@&*?!"; //special characters we need to check for
	r6 = false; //Assusme violation of rule 6
	for (int i = 0; i < pw.length(); i++)
	{
		c = pw.at(i); //c gets the i-th char from pw
		if (specialChars.find(c) != string::npos)//keeps checking until the end of the string
			countSpecial++;
	}
	if (countSpecial > 0) //if one special character is found r6 is set to true
		r6 = true;
}
void s7() //checks if the password has a special number
{
	int countSpecialN = 0;
	r7 = false; //Assusme violation of rule 7
	for (int i = 0; i < pw.length(); i++)
	{
		if (pw.find("2020") != string::npos) //checks for the special number
			countSpecialN++;
		else if (pw.find("2019") != string::npos) //checks for the special number
			countSpecialN++;
		else if (pw.find("2018") != string::npos) //checks for the special number
			countSpecialN++;
		else if (pw.find("2017") != string::npos) //checks for the special number
			countSpecialN++;
		else
			countSpecialN = 0;
	}
	if (countSpecialN == 0) //if no special character is found r7 is set to true
		r7 = true;
}