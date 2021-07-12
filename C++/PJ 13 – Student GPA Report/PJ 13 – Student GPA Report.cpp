// Author:  Francisco Valadez
// Date:    12/18/2020
// Purpose: PJ13-Student GPA: This program allows the user to add a students information and then displays the results!

#include <iomanip>
#include <string>
#include <iostream>
using namespace std;

//Declaration of Global Variables
static int countStudents = 0; // count the total number of students being constructed
static double totalGpa = 0.0; // total GPA sum of all students // don’t use float
static double averageGpa = 0.0; // average GPA of all students // don’t use float
static string sidA[12]; // 5 static parallel arrays of 12 items each
static string lnameA[12]; // like 5 fields for each student record up to 12
static string fnameA[12]; // students.
static double gpaA[12];
static string phoneA[12];

//Prototypes
int StudentId(string userInput);

class Student
{
public:

	Student(string id, string lastName, string firstName, double gpa, string phone, int counter)
	{
		//sent to other functions to print
		setID(id, counter);
		setLast(lastName, counter);
		setfirstName(firstName, counter);
		setGPA(gpa, counter);
		setPhone(phone, counter);

		//calculates total GPA
		totalGpa += gpa;
		averageGpa = totalGpa / (counter + 1);
		cout << "Current Student Count: " << counter + 1 << ", Total GPA: ";
		cout << fixed << showpoint;
		cout << setprecision(2);
		cout << totalGpa << ", Average GPA:" << averageGpa << endl;
	}

	void setID(string x, int counter)
	{
		id = x;
		sidA[counter] = id;
		cout << "Student id: " << id << ", ";
	}

	void setLast(string x, int counter)
	{
		lastName = x;
		lnameA[counter] = lastName;
		cout << "Last Name: " << lastName << ", ";
	}

	void setfirstName(string x, int counter)
	{
		firstName = x;
		fnameA[counter] = firstName;
		cout << "First Name: " << firstName;
	}
	void setGPA(double x, int counter)
	{
		gpa = x;
		gpaA[counter] = gpa;
		cout << fixed << showpoint;
		cout << setprecision(2);
		cout << "GPA: " << gpa << ", ";
	}
	void setPhone(string x, int counter)
	{
		phone = x;
		phoneA[counter] = phone;
		cout << "Phone Number: " << phone << endl;
	}

	string getLast()
	{
		return lastName;
	}

	string getID()
	{
		return id;
	}

private:

	string id;
	string lastName;
	string firstName;
	double gpa;
	string phone;
};



int main()
{
	//Declaration of Variables
	string studentID;	// student’s ID 			such as   1
	string lastName;  	// student’s last name 		such as   Doe
	string firstName;  	// student’s first name 	such as   John
	double gpa;			// student’s GPA 			such as   3.0
	string phoneNumber;	// student’s phone number  	such as   626-111-1111
	int counter = 0;

	//Welcome message
	cout << "Welcome to the Student GPA System of Francisco Valadez!" << endl;

	do
	{
		//Message to the user
		cout << ++counter << "=========================================================" << endl
			<< ">> Please enter student id, last name, first name, GPA, and phone number>" << endl;

		//Grabs users input until the end of the line
		cin >> studentID >> lastName >> firstName >> gpa >> phoneNumber;

		//Breaks out of the loop if the user wants to exit
		if (studentID == "0")
			break;
		//sent to student class and constructor
		Student send(studentID, lastName, firstName, gpa, phoneNumber, counter - 1);


	} while (counter < 20);

	cout << ++counter << "=========================================================" << endl;

	cout << "Student GPA Report:\n\n";

	cout << "ID\tLast Name\tFirst Name\tGPA\tPhone Number" << endl
		<< "----- -------------- ---------------- -------- -------------" << endl;

	//Prints the results
	for (int x = 0; x < counter - 2; x++)
	{
		cout << sidA[x] << setw(14) << lnameA[x] << setw(17) << fnameA[x] << "\t" << gpaA[x] << "\t" << phoneA[x] << endl;
	}
	cout << "\nThe Average GPA for the above " << counter - 2 << " students is ";
	cout << fixed << showpoint;
	cout << setprecision(2);
	cout << averageGpa << endl << endl;

	//Goodbye message
	cout << ++counter << "=========================================================" << endl
		<< "Thank you for using the Student GPA system of Francisco Valadez!" << endl;
	cout << ++counter << "=========================================================" << endl;
}
