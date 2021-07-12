//Written by: Francisco Valadez
//Assignment: HW03 - Pg. 71 - #2.10
//Class: CS 113
//Date: 4/28/2021
//Description:  This program prompts the user for the weight of water, inital temperature
//              and final temperature in order to calculate the energy needed to heat the water.

import java.util.Scanner;

public class Energy
{
    public static void main(String[] args)
    {
        double weight, temp_initial, temp_final, joules;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        weight = scan.nextDouble();
        System.out.print("Enter the initial temperature: ");
        temp_initial = scan.nextDouble();
        System.out.print("Enter the final temperature: ");
        temp_final = scan.nextDouble();

        joules = weight * 4184 * (temp_final - temp_initial);

        System.out.println("The energy needed is " + joules);

    }
}