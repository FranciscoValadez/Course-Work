//Written by: Francisco Valadez
//Assignment: HW 09 - Pg. 234 - #6.4
//Class: CS 113
//Date: 5/19/2021
//Description: This program gets reverses the numbers that the user inputs

import java.util.Scanner;

public class Integer 
{
    //This method reverses the integer and prints the result
    public static void reverse(int number)
    {
        String num = String.valueOf(number), reverseNum = "";
        //This loop reverses the integer into a string
        for(int i = num.length() - 1; i != -1; i--)
        {
            reverseNum += num.charAt(i);
        }
        //Prints the value reversed
        System.out.println(reverseNum);
    }

    public static void main(String[] args)
    {

        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("This program displays an integer reversed!");
        System.out.print("Enter an integer: ");
        num = input.nextInt();

        //sends the input to this method to be reversed and printed
        reverse(num);

    }    
}
