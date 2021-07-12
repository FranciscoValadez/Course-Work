//Written by: Francisco Valadez
//Assignment: HW 11 - Pg. 150 - #4.18
//Class: CS 113
//Date: 5/26/2021
//Description: This program displays a studnents major and their status

import java.util.Scanner;

public class Major 
{
    //This method returns the correct value depending on the 2nd character
    public static String selection(String student)
    {
        if (student.charAt(1) == '1')
        {
            return "Freshman";
        }
        else if (student.charAt(1) == '2')
        {
            return "Sophmore";
        }
        else if (student.charAt(1) == '3')
        {
            return "Junior";
        }
        else if (student.charAt(1) == '4')
        {
            return "Senior";
        }
        else 
            return "";
    }
    public static void main(String[] args)
    {
        String student = "";
        Scanner input = new Scanner(System.in);
        System.out.println("This program tells a user their major and status");
        System.out.print("Enter two characters: ");
        student = input.nextLine();

        if (student.charAt(0) == 'M')
        {
            System.out.println("Mathematics " + selection(student));
        }
        else if (student.charAt(0) == 'C')
        {
            System.out.println("Computer Science " + selection(student));
        }
        else if (student.charAt(0) == 'I')
        {
            System.out.println("Information Technology " + selection(student));
        }
        else 
            System.out.println("Invalid input");
    }    
}
