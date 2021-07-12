//Written by: Francisco Valadez
//Assignment: Lab 03 - Pg. 69 - #2.3
//Class: CS 113
//Date: 4/23/2021
//Description: This program takes user input and converts feet into meters.

import java.util.Scanner;

public class Feet_to_Meters
{
   public static void main(String[] args)
   {
      double feet, meters;
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a value for feet: ");
      feet = scan.nextDouble();
      
      meters = feet * .305;
      
      System.out.println( feet + " feet is " + meters + " meters");
   }
}