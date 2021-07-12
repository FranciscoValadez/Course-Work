//Written by: Francisco Valadez
//Assignment: HW 14 - Pg. 278 - #7.12
//Class: CS 113
//Date: 6/6/2021
//Description: This program reverses an array of 10 numbers filled by the user

import java.util.Scanner;

public class reverse 
{
    //This function reverses an integer array
    public static int[] reverseArray(int[] normalArray)
    {
        int[] reversedArray = new int[normalArray.length];
        for(int i = 0; i < normalArray.length; i++)
        {
            reversedArray[i] = normalArray[normalArray.length - i - 1];
        }

        return reversedArray;
    }

    //This function prints the results
    public static void print(int[] reversedArray)
    {
        System.out.print("Reversed Array: ");
        for(int i = 0; i < reversedArray.length; i++)
        {
            System.out.print(reversedArray[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int[] normalArray = new int[10];
        
        Scanner input = new Scanner(System.in);
        System.out.println("This program reverses an array of integers.");
        System.out.print("Please enter 10 numbers: ");
        for(int i = 0; i < normalArray.length; i++)
        {
            normalArray[i] = input.nextInt();
        }

        //the function to reverse the array and to print the results are called
        print(reverseArray(normalArray));
    }    
}
