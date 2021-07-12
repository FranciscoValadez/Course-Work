/*
Written by: Francisco Valadez
Assignment: HW 1.4
Class: CS 113
Date: 4/21/2021
Description: This program displays a table
*/

import java.util.Scanner;

public class Print_A_Table_1_4
{
   public static void main(String[] args)
   {
      System.out.println("a\t\ta^2\ta^3");
      System.out.println(1 + "\t\t" + (int)Math.pow(1,1) + "\t\t" + (int)Math.pow(1,2));
      System.out.println(2 + "\t\t" + (int)Math.pow(2,1) + "\t\t" + (int)Math.pow(2,2));
      System.out.println(3 + "\t\t" + (int)Math.pow(3,1) + "\t\t" + (int)Math.pow(3,2));
      System.out.println(4 + "\t\t" + (int)Math.pow(4,1) + "\t\t" + (int)Math.pow(4,2));
   }
}