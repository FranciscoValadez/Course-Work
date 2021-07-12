//Written by: Francisco Valadez
//Assignment: Lab 02 - Pg. 31 - #1.7
//Class: CS 113
//Date: 4/22/2021
//Description: This program displays the results of an approximation of PI


import java.util.Scanner;

public class Approximate_PI
{
   public static void main(String[] args)
   {
      double problem_1, problem_2;
      
      problem_1 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
      problem_2 = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
      
      System.out.println("The solution to problem 1 is: " + problem_1);
      System.out.println("The solution to problem 2 is: " + problem_2);
   }
}