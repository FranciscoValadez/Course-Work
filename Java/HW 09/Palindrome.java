//Written by: Francisco Valadez
//Assignment: HW 09 - Pg. 234 - #6.3
//Class: CS 113
//Date: 5/19/2021
//Description: This program lets the user input a number to check if its a palindrome

import java.util.Scanner;

public class Palindrome 
{
    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number)
    {
        String num = String.valueOf(number), reverseNum = "";
        int num2;
        
        for(int i = num.length() - 1; i != -1; i--)
        {
            reverseNum += num.charAt(i);
        }
        
        return Integer.parseInt(reverseNum);
    }
    
    // Return true if number is a palindrome
    public static boolean isPalindrome(int number)
    {
        //sends the number to be reveresed and then is compared to see if its the same
        if (reverse(number) == number)
            return true;
        else 
            return false;
    }

    public static void main(String[] args)
    {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("This program checks if an integer is a palindrome");
        System.out.print("Enter an integer: ");
        num = input.nextInt();

        //sends the user's number to be checked if its a palindrome
        if(isPalindrome(num) == true)
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is not a palindrome");
    }    
}
