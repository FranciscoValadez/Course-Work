//Written by: Francisco Valadez
//Assignment: Lab 13 - Pg. 276 - #7.2
//Class: CS 113
//Date: 5/31/2021
//Description: This program prompts the user for 10 digits the
//             reverses the numbers order and shows it to the user

import java.util.Scanner;

public class reverse 
{
    public static void main(String[] args)
    {
        int[] num = new int[10];

        Scanner input = new Scanner(System.in);        
        System.out.println("This program reverses 10 numbers");
        //gets 10 integers from the user
        for(int i = 0; i <10; i++)
        {
            num[i] = input.nextInt();
        }
        //Prints the reversed array
        System.out.println("The list of reveres numbers: ");
        for(int i = num.length - 1; i >= 0; i--)
        {
            System.out.print(num[i] + " ");
        }
    }
}
