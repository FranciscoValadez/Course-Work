//Written by: Francisco Valadez
//Assignment: HW04 - Pg. 74 - #2.21
//Class: CS 113
//Date: 4/30/2021
//Description: This program propmts the user for a monthly savings amount then displays
//             the total account value after 6 months

import java.util.Scanner;

public class Investment
{
    public static void main(String[] args)
    {
        double amount, rate, years, total;

        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the total value of an investment");
        System.out.print("Enter the investment amount: ");
        amount = scan.nextDouble();
        System.out.print("Enter the annual interest rate in percentage: ");
        rate = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        years = scan.nextDouble();

        rate = rate / 1200.0;

        total = amount * Math.pow((1 + rate), (years * 12));

        System.out.println("Accumalated value is $" + total);
        
        
    }
}