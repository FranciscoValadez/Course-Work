//Written by: Francisco Valadez
//Assignment: Lab 02 - Pg. 31 - #1.12
//Class: CS 113
//Date: 4/22/2021
//Description: This program displays the average speed in kilometers per hour.


import java.util.Scanner;

public class Average_Speed_KM
{
   public static void main(String[] args)
   {
      double distance, time, speed, miles, kilometers;
      
      miles = 24;
      time = 100.583 / 60; //Divide by 60 since its MPH
      kilometers = miles * 1.6; //Converts kilometer to miles
      speed = miles / time; // Speed formulat
      
      System.out.println("The Average speed in MPH of a runner who ran " + kilometers
                         + "\nkilometers in "+ time*60 + " minutes is: \n" + speed + " MPH");
   }
}