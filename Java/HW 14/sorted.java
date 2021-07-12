//Written by: Francisco Valadez
//Assignment: HW 14 - Pg. 280 - #7.19
//Class: CS 113
//Date: 6/6/2021
//Description: This program checks if a list of integers inputed by the user is sorted

import java.util.Scanner;

public class sorted 
{
    //This function checks if the array is sorted returns a boolean value
    public static boolean check(int[] list)
    {
        for(int i = 1; i < list.length; i++)
        {
            if(list[i] < list[i - 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int amount;
        Scanner input = new Scanner(System.in);
        System.out.println("This program checks if a list of numbers is sorted.");
        System.out.print("Enter list: ");
        amount = input.nextInt();

        //New aray with amount of user desired numbers is created
        int[] list = new int[amount];
        //This for looop fills the array with the users desired amount of numbers
        for(int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
        }

        //the array is sent to the check function and will retrun true if the array is sorted
        if (check(list))
        {
            System.out.println("The list is already sorted");
        }
        else
            System.out.println("The list is not sorted.");
    }  
}
