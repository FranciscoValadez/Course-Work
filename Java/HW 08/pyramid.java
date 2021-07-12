//Written by: Francisco Valadez
//Assignment: HW 08 - Pg. 193 - #5.17
//Class: CS 113
//Date: 5/19/2021
//Description: This program prints a pyramid with the user's desired height

import java.util.Scanner;

public class pyramid 
{
    public static void main(String[] args)
    {
        int lineAmount;

        Scanner input = new Scanner(System.in);
        System.out.println("This program displays a pyramid between 1 and 15 lines of height.");
        System.out.print("Enter the number of lines: ");
        lineAmount = input.nextInt();

        //this loop is for the amount of lines
        for (int line = 1; line <= lineAmount; line++) 
        {	
            //this loop prints the spaces on the left
			for (int spaces = lineAmount - line; spaces >= 1; spaces--)
				System.out.print("   ");
            //this loop prints the numbers on the left
            for (int left = line; left >= 2; left--)
				System.out.print(left + "  ");
            //this loop prints the numbers on the right
			for (int right = 1; right <= line; right++)
				System.out.print(right + "  ");
            //moves next set of numbers to new line
			System.out.println();
		}
    }    
}
