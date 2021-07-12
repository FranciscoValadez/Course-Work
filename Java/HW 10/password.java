//Written by: Francisco Valadez
//Assignment: HW 10 - Pg. 236 - #6.18
//Class: CS 113
//Date: 5/23/2021
//Description: This program checks the users password

import java.util.Scanner;

public class password 
{
    //checks the password length
    public static boolean Length(String Pw)
    {
        if (Pw.length() >= 8)
            return true;
        else
            return false;
    }
    //Checks for at least 2 digits
    public static boolean digits(String Pw)
    {
        int counter = 0;
        String numbers = "0123456789";
        for(int i = 0; i < Pw.length(); i++)
        {
            char counterChar = Pw.charAt(i);
            for(int x = 0; x < 10; x++)
            {
                char numChar = numbers.charAt(x);
                if( numChar == counterChar)
                    counter++;
            }       
        }
        if (counter > 1)
            return true;
        else
            return false;

    }
    //Checks if password has only letters and digits
    public static boolean check(String Pw)
    {
        int counter = 0;
        String numbers = "0123456789";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String lettes2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i = 0; i < Pw.length(); i++)
        {
            char counterChar = Pw.charAt(i);
            for(int x = 0; x < numbers.length(); x++)
            {
                char numChar = numbers.charAt(x);
                if( numChar != counterChar)
                    counter++;
            }
            for(int x = 0; x < letters.length(); x++)
            {
                char letterChar = letters.charAt(x);
                if( letterChar != counterChar)
                    {
                        ++counter;
                        for(int y = 0; y < letters.length(); y++)
                        {
                            char letterChar2 = letters.charAt(y);
                            if (letterChar2 == counterChar)
                                --counter;
                        }
                    }
            }
        }
        System.out.println(counter);
        if (counter > 0)
            return false;
        else
            return true;

    }
    public static void main(String[] args)
    {
        String Pw = "";
        
        Scanner input = new Scanner(System.in);
        System.out.println("This program checks if a password is valid");
        System.out.print("Enter a password: ");
        Pw = input.nextLine();

        if (Length(Pw) && digits(Pw))
            System.out.println("The password " + Pw + " is Valid password");
        else
            System.out.println("The password " + Pw + " is an Invalid Password");
    }    
}
