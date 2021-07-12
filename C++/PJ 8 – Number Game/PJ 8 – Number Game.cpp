// Author:  Francisco Valadez
// Date:    11/25/2020
// Purpose: CS116-PJ8: This is a number game that gets 3 numbers from the user and shows the user the 
// numbers that they input, the numbers in order from least to greatest, the sum of the numbers and the average of all 3 numbers

#include <iostream>
#include <math.h>
using namespace std;

int max(int p, int q, int r); // prototype to return maximum of p, q, r
int min(int p, int q, int r); // prototype to return minimum of p, q, r
int mid(int p, int q, int r); // prototype to return middle  of p, q, r 

int main()
{
    //integers here will be defined by user input
    int num1, num2, num3;
    //Counter
    int i = 1;
    cout << "Welcome to this Number Game of Francisco Valadez!\n";

    for (i;; i++)
    {
        cout << i << "=====================================================.\n"
            << "Please enter 3 integer numbers in any order (-999 to stop) : ";
        cin >> num1 >> num2 >> num3;
        
        //Checks if the user wants to exit the proram
        if (num1 == -999)
        {
            
            //Goodbye message
            cout << ++i << "=====================================================.\n"
                << "Thank you for playing this Number Game of Francisco Valadez"
                << "\n" << i+1 << "=====================================================.\n";
            
            //ends loop
            break;
        }

        //Prints the numbers entered
        cout << "You just entered 3 numbers: " << num1 << ", " << num2 << ", " << num3;
        //Prints the numbers in order
        cout << "\nThese 3 numbers in order are " << min(num1, num2, num3) << ", " << mid(num1, num2, num3) << ", " << max(num1, num2, num3);
        //Prints the sum and the Average
        cout << "\nThe sum is " << num1 + num2 + num3 << " and the average is " << (num1 + num2 + num3) / 3 << "\n";
    } 

}

int mid(int p, int q, int r) //returns the middle number
{
    if (q >= p && q <= r)  
        return q;   // case 1:  r, q , p     i.e.,      r <= q <= p         
    if (q >= r && q <= p)  
        return q;   // case 2:  p, q, r      i.e.,      p <= q <= r
    if (r >= q && r <= p)
        return r;
    if (r >= p && r <= q)
        return r;
    if (p >= r && p <= q)
        return p;
    if (p >= q && p <= r)
        return p;
}

int max(int p, int q, int r) //Returns the bigger number
{
    if (p >= q && p >= r)
        return p;
    if (q >= r && q >= p)
        return q;
    if (r >= q && r >= p)
        return r;
}

int min(int p, int q, int r) //Returns the smallest number
{
    if (p <= r && p <= q)
        return p;
    if (r <= p && r <= q)
        return r;
    if (q <= r && q <= p)
        return q;
}