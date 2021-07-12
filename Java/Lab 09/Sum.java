//Written by: Francisco Valadez
//Assignment: Lab 09 - Pg. 234 - #6.2
//Class: CS 113
//Date: 5/17/2021
//Description: This program calculates the total sum of all the digits of an integer given by the user

import java.util.Scanner;

public class Sum 
{
    public static int sumDigits(long num)
    {
        int total = 0;
        do
        {
            total = total + ((int)num) % 10;
            num /= 10;
        }while(num != 0);

        return total;
    }

    public static void main(String[] args)
    {
        long num;

        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates the sum of all the digits in an integer");
        System.out.print("Enter an integer: ");
        num = input.nextLong();

        System.out.println("Total: " + sumDigits(num));
    }    
}
