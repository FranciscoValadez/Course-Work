//Written by: Francisco Valadez
//Assignment: HW02 - Pg. 31 - #1.13
//Class: CS 113
//Date: 4/23/2021
//Description: This program solves for the x and y varialbe of a 2x2 linear equation.

public class Linear_Equation_1_13
{
   public static void main(String[] args)
   {
      double x_integer, y_integer;
      
      x_integer = (44.5*.55 - 50.2*5.9)/(3.4*.55 - 50.2*2.1);
      y_integer = (3.4*5.9 - 44.5*2.1)/(3.4*.55 - 50.2*2.1);
      
      System.out.println("Value of x: " + x_integer);
      System.out.println("Value of y: " + y_integer);
   }
}