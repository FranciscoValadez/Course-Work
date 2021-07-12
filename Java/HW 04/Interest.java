//Written by: Francisco Valadez
//Assignment: HW04 - Pg. 74 - #2.20
//Class: CS 113
//Date: 4/30/2021
//Description: This program propmts the user for a the balance and interest rate
//             in order to calculate the total interest for that month

import java.util.Scanner;

public class Interest
{
    public static void main(String[] args)
    {
        double balance, rate, total;

        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the interest for a month's payment.");
        System.out.print("Enter the balance and interest rate (e.g., 3 for 3%): ");
        balance = scan.nextDouble();
        rate = scan.nextDouble();

        total = balance * (rate/1200);

        System.out.println("The interest is " + total);
        
    }
}