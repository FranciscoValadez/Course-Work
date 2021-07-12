/*
Written by: Francisco Valadez
Assignment: HW 1.8
Class: CS 113
Date: 4/21/2021
Description: This program shows the user the perimeter and area of a circle with a width of 5.5
*/

import java.util.Scanner;

public class Area_and_Perimeter_1_8
{
   public static void main(String[] args)
   {
      double radius = 5.5;
      double area, perimeter;
      
      perimeter = 2 * radius * Math.PI;
      area = radius * radius * Math.PI;
      
      System.out.println("The perimeter of a circle with the radius of \"" + radius + "\" is : " + perimeter);
      System.out.println("The area of a circle with the radius of \"" + radius + "\" is : " + area);
   }
}