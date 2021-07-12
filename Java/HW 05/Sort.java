//Written by: Francisco Valadez
//Assignment: HW05 - Pg. 110 - #3.8
//Class: CS 113
//Date: 5/5/2021
//Description: This program prompts the user for 3 integers then sorts them from least to greatest.

import java.util.Scanner;

public class Sort 
{
    public static void main(String[] args)
    {
        int num1, num2, num3;

        Scanner scan = new Scanner(System.in);
        System.out.println("This program sorts 3 integers from least to greatest!");
        System.out.println("Please input 3 numbers (Ex: 1 2 3): ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        //num1 is lowest
        if ((num1 <= num2) && ( num2 <= num3))
            System.out.println(num1 + " " + num2 + " " + num3);
        else if ((num1 <= num3) && ( num3 <= num2))
            System.out.println(num1 + " " + num3 + " " + num2);
        //num2 is lowest
        else if ((num2 <= num1) && ( num1 <= num3))
            System.out.println(num2 + " " + num1 + " " + num3);
        else if ((num2 <= num3) && ( num3 <= num1))
            System.out.println(num2 + " " + num3 + " " + num1);
        //num3 is lowest
        else if ((num3 <= num1) && ( num1 <= num2))
            System.out.println(num3 + " " + num1 + " " + num2);
        else  if ((num3 <= num2) && ( num2 <= num1))
            System.out.println(num3 + " " + num2 + " " + num1);
            
        
    }
    
}
