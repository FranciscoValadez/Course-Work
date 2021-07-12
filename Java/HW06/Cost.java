//Written by: Francisco Valadez
//Assignment: HW06 - Pg. 117 - #3.33
//Class: CS 113
//Date: 5/15/2021
//Description: This program compares the weight and price of 2 packages and
//             shows the user what the better purchase is

import java.util.Scanner;

public class Cost 
{
    public static void main(String[] args)
    {
        double weight1, weight2, price1, price2;

        Scanner input = new Scanner(System.in);
        System.out.println("This program compares the cost of 2 types of rice.");
        System.out.print("Enter the weight and price for package 1: ");
        weight1 = input.nextDouble();
        price1 = input.nextDouble();
        System.out.print("Enter the weight and price for package 2: ");
        weight2 = input.nextDouble();
        price2 = input.nextDouble();

        if(weight1/price1 > weight2/price2)
            System.out.println("Package 1 has a better price.");
        else
            System.out.println("Package 2 has a better price.");

    }
}
