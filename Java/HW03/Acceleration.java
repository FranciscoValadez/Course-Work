//Written by: Francisco Valadez
//Assignment: HW03 - Pg. 71 - #2.9
//Class: CS 113
//Date: 4/26/2021
//Description: This program prompts the user for a stating velocity, 
//             ending velocity and time in order to display the average acceleration

import java.util.Scanner;

public class Acceleration
{
    public static void main(String[] args)
    {
        double velocity0, velocity1, time, accel;
        int accel2;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        velocity0 = scan.nextDouble();
        velocity1 = scan.nextDouble();
        time = scan.nextDouble();

        accel = (velocity1 - velocity0) / time;

        System.out.println("The average acceleration is " + accel);
    }
}