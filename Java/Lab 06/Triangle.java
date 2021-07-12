//Written by: Francisco Valadez
//Assignment: Lab06 - Pg. 111 - #3.19
//Class: CS 113
//Date: 5/14/2021
//Description: This program prompts the user for 3 sides of a triangle 
//then checks if the sides are valid and prints the perimeter is the sides are valid

import java.util.Scanner;

public class Triangle 
{
    public static void main(String[] args)
    {
        int side1, side2, side3;

        Scanner input = new Scanner(System.in);
        System.out.println("This progam checks if the 3 sides of a triangle are valid computes the perimeter.");
        System.out.println("Enter the 3 sides (Ex: 1 2 3): ");
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();

        //checks if a negative number is entered
        if ((side1 < 0 ) || (side2 < 0 ) || (side3 < 0 ))
        {
            System.out.println("A positive number was not entered.");
        }
        else
        {
            //checks if the numbers make a triangle
            if ((side1 < side2 + side3) && (side2 < side1 + side3) && (side3 < side2 + side1))
                System.out.println("The three sides: " + side1 + " " + side2 + " " + side3 + " are valid.\n" + 
                                   "The perimeter is: " + (side1 + side2 + side3));
            else
                System.out.println("The three sides: " + side1 + " " + side2 + " " + side3 + " are not valid.");
        }
        
    }
}
