//Written by: Francisco Valadez
//Assignment: HW03 - Pg. 71 - #2.13
//Class: CS 113
//Date: 4/29/2021
//Description: This program propmts the user for a monthly savings amount then displays
//             the total account value after 6 months

import java.util.Scanner;

public class Compound_Value
{
    public static void main(String[] args)
    {
        double amount, total;

        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the total of a savings acount after 6 months.");
        System.out.print("Enter the monthly saving amount: ");
        amount = scan.nextDouble();

        total = amount * (1 + 0.00417); // 1st month
        total = (amount + total) * (1 + 0.00417); // 2nd month
        total = (amount + total) * (1 + 0.00417); // 3rd month
        total = (amount + total) * (1 + 0.00417); // 4th month
        total = (amount + total) * (1 + 0.00417); // 5th month
        total = (amount + total) * (1 + 0.00417); // 5th month


        System.out.println("After the sixth month, the account value is " + total);
    }    
}
