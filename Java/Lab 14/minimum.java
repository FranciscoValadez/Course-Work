//Written by: Francisco Valadez
//Assignment: Lab 12 - Pg. 278 - #7.9
//Class: CS 113
//Date: 6/4/2021
//Description: This program finds the smallest value of type double in an array

import java.util.Scanner;

public class minimum 
{
    //This method cycles through the array until it finds the smallest value
    public static double min(double[] array)
    {
        double smallest = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(smallest > array[i])
                smallest = array[i];
        }
        return smallest;
    }
    public static void main(String[] args)
    {
        double[] num = new double[10];

        Scanner input = new Scanner(System.in);
        System.out.println("This program finds the smallest number");
        System.out.print("Enter 10 numbers of type double: ");
        //gets the usrers input
        for(int i = 0; i < 10; i++)
        {
            num[i] = input.nextDouble();
        }
        //prints the smallest number
        System.out.println("The minimum number is: " + min(num));
    }    
}
