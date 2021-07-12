//Written by: Francisco Valadez
//Assignment: Lab 02 - Pg. 31 - #1.10
//Class: CS 113
//Date: 4/23/2021
//Description: This program displays the average speed in miles per hour

public class Average_Speed_MPH
{
   public static void main(String[] args)
   {
      double kilometers, miles, time, speed;
      
      kilometers = 14;
      miles = kilometers / 1.6;
      time = 45.5 / 60; // dividing by 60 since its MPH
      speed = miles / time;
      
      System.out.println("The average speed in MPH is: " + speed );
   }
}