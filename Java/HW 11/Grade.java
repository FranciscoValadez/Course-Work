//Written by: Francisco Valadez
//Assignment: HW 11 - Pg. 150 - #4.14
//Class: CS 113
//Date: 5/26/2021
//Description: This program converts a letter grade into a numeric value

import java.util.Scanner;

public class Grade 
{
    public static void main(String[] args)
    {
        String letter;
        int value;

        Scanner input = new Scanner(System.in);
        System.out.println("This program converts a letter grade into a numeric value");
        System.out.print("Ener a letter grade: ");
        letter = input.next();

        switch (letter)
        {
            case "A": 
                System.out.println("The numberic value for grade " + letter + " is 4"); break;
            case "B": 
                System.out.println("The numberic value for grade " + letter + " is 3"); break;
            case "C": 
                System.out.println("The numberic value for grade " + letter + " is 2"); break;
            case "D": 
                System.out.println("The numberic value for grade " + letter + " is 1"); break;
            case "F": 
                System.out.println("The numberic value for grade " + letter + " is 0"); break;
            default:
                System.out.println(letter + " is an invalid grade");

        }
    }   
}
