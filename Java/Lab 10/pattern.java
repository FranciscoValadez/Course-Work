//Written by: Francisco Valadez
//Assignment: Lab 10 - Pg. 235 - #6.6
//Class: CS 113
//Date: 5/21/2021
//Description: This program prints a patern with the user's desired height

import java.util.Scanner;

public class pattern 
{
    //This method prints the desired rows of numbers
    public static void print(int lineAmount)
    {
        for (int line = 1; line <= lineAmount; line++) 
        {	
            //this loop prints the spaces on the left
			for (int spaces = lineAmount - line; spaces >= 1; spaces--)
				System.out.print("   ");
            //this loop prints the numbers on the left
            for (int left = line; left >= 1; left--)
				System.out.print(left + "  ");
            //moves next set of numbers to new line
			System.out.println();
		}
    }
    public static void main(String[] args)
    {
        int lineAmount;

        Scanner input = new Scanner(System.in);
        System.out.println("This program displays a pyramid between 1 and 15 lines of height.");
        System.out.print("Enter the number of lines: ");
        lineAmount = input.nextInt();
        
        //sends the users inputed amount to be printed
        print(lineAmount);

    }    
}
