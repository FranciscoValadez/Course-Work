//Written by: Francisco Valadez
//Assignment: HW12 - Pg. 150 - #4.22
//Class: CS 113
//Date: 5/31/2021
//Description: This program propmts checks if the second string the user inputs
//             is a substring of the first user inputed string

import java.util.Scanner;

public class sub 
{
    //this boolean function checks to see if s2 is a substring of s1
    public static boolean check(String s1, String s2)
    {
        String s3 = "";

        for(int i = 0; i < s1.length(); i++)
        {
            s3 = "";
            //The string s3 is filled with remaining varialbes of s1 after incrementing i by 1 at each loop
            for(int x = i; s1.length() - i > x; x++)
            {
                s3 += s1.charAt(x);
                if(s2.equals(s3)) //if it is a substring the fucntion returns true
                    return true;   
            }
        }
        
        return false;
    }
    public static void main(String[] args)
    {
        String s1 = "", s2 = "";
        int counter = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("This program compares 2 strings to find if the second string is a substring");
        System.out.print("Enter String s1: ");
        s1 = input.next();
        System.out.print("Enter String s2: ");
        s2 = input.next();

        //The users input is sent to a boolean function to check for a substring
        if(check(s1, s2))
            System.out.println(s2 + " is a substring of " + s1);
        else
            System.out.println(s2 + " is not a substring of " + s1);

    }    
}
