//Written by: Francisco Valadez
//Assignment: HW 14 - Pg. 279 - #7.15
//Class: CS 113
//Date: 6/6/2021
//Description: This program checks for duplicates in a list of numbers and then removes
//              the duplicate numbers

import java.util.Scanner;

public class duplicates 
{
    //This function removes duplicate numbers
    public static int[] eliminateDuplicates(int[] list)
    {
        int[] fixed = new int[10];
        int counter = 0, position = 0;

        //these nested for loops compare the new array with array passed to this function 
        for(int i = 0; i < list.length; i++)
        {
            counter = 0; // resets the counter when checking a new number
            for(int x = 0; x < fixed.length; x++)
            {
                if(list[i] == fixed[x])
                    counter++;
            }

            if(counter == 0)
            {
                fixed[position] = list[i];
                ++position; //the next element is filled
            }
        }
        //returs an array that doesnt have duplicate numbers
        return fixed;
    }

    //This function prints the results
    public static void print(int[] fixed)
    {
        System.out.print("The distinct numbers are: ");
        for(int i = 0; i < fixed.length; i++)
        {
            if(( i > 0 ) && (fixed[i] == 0))
                break;
            System.out.print(fixed[i] + " ");   
        }
    }

    public static void main(String[] args)
    {
        int[] list = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.println("This program removes duplicated numbers!");
        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
        }

        //calls a function to get remove the duplicate numbers then another to print the new array
        print(eliminateDuplicates(list));

    }    
}
