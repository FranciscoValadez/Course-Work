//Written by: Francisco Valadez
//Assignment: HW 09 - Pg. 234 - #6.5
//Class: CS 113
//Date: 5/19/2021
//Description: This program gets 3 numbers from the user and sorts them in increasing order
//             by sending the varialbes to a method

import java.util.Scanner;

public class Sort 
{
    //This method prints the numbers in ascending order
    public static void displaySortedNumbers(double num1, double num2, double num3)
    {
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

    public static void main(String[] args)
    {
        double num1, num2, num3;
        
        Scanner input = new Scanner(System.in);
        System.out.println("This program displays 3 numbers in increasing order.");
        System.out.print("Enter 3 numbers: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
        
        //numbers are sent to a void method
        displaySortedNumbers(num1, num2, num3);
    }
}
