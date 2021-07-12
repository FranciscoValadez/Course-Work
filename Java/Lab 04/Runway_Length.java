//Written by: Francisco Valadez
//Assignment: HW03 - Pg. 71 - #2.12
//Class: CS 113
//Date: 4/29/2021
//Description: This program prompts the user forr speed and acceleration in order to provide
//             the minimum runway length for an airplane

import java.util.Scanner;

public class Runway_Length 
{
    public static void main(String[] args)
    {
        double length, acceleration, velocity;

        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the minimum runway length needed for a plane.");
        System.out.print("Enter speed and acceleration: ");
        velocity = scan.nextDouble();
        acceleration = scan.nextDouble();

        length = Math.pow(velocity, 2) / (2 * acceleration) ;

        System.out.println("The minimum runway length for this airplane is " + length);
    }    
}
