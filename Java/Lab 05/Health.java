//Written by: Francisco Valadez
//Assignment: Lab 05 - Pg. 109 - #3.6
//Class: CS 113
//Date: 5/4/2021
//Description: This program computes a users BMI

import java.util.Scanner;

public class Health
{
    public static void main(String[] args)
    {
        double weight, feet, inches, BMI; 
        
        Scanner scan = new Scanner(System.in);
        System.out.println("This program computes BMI!");
        System.out.print("Enter weight in pounds: ");
        weight = scan.nextDouble();
        System.out.print("Enter feet: ");
        feet = scan.nextDouble();
        System.out.print("Enter inches: ");
        inches = scan.nextDouble();

        final double KilosPP = .045359237;
        final double MetersPI = .0254;

        double height = feet * 12 + inches;
        double weightKilos = weight * KilosPP;
        double heightMeters = height * MetersPI;
        BMI = (weightKilos/(heightMeters * heightMeters)) * 10; 

        System.out.println("BMI is " + BMI);
        
        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI < 25)
            System.out.println("Normal");
        else if (BMI < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
        
        
    }
}