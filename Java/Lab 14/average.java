//Written by: Francisco Valadez
//Assignment: Lab 12 - Pg. 278 - #7.8
//Class: CS 113
//Date: 6/4/2021
//Description: This program promts the user for 10 numbers then displays the average

import java.util.Scanner;

public class average 
{
    //overloaded methods
    public static int average(int[] array)
    {
        int total = 0;
        for(int i = 0; i < 10; i++)
        {
            total += array[i];
        }
        return total/array.length;
    }
    public static double average(double[] array)
    {
        double total = 0;
        for(int i = 0; i < 10; i++)
        {
            total += array[i];
        }
        return total/array.length;
    }
    public static void main(String[] args)
    {
        double[] num = new double[10];

        Scanner input = new Scanner(System.in);
        System.out.println("This program displays the average of 2 numbers");
        System.out.print("Enter the 10 numbers of type double: ");
        //gets the usrers input
        for(int i = 0; i < 10; i++)
        {
            num[i] = input.nextDouble();
        }
        //prints the average
        System.out.println("Average: " + average(num));

    }    
}
