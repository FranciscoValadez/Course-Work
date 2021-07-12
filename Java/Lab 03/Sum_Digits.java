//Written by: Francisco Valadez
//Assignment: Lab 03 - Pg. 70 - #2.6
//Class: CS 113
//Date: 4/23/2021
//Description: This program takes a users input from 0-1000 and adds all the numbers digits

import java.util.Scanner;

public class Sum_Digits
{
   public static void main(String[] args)
   {
      int number, total;
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number between 0 and 1000: ");
      number = scan.nextInt();
      
      total = number%10 + (number/10)%10 + number/100;
      
      System.out.println("The sum of the digits is " + total);
   }
}