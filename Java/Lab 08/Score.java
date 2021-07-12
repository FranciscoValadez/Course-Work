//Written by: Francisco Valadez
//Assignment: Lab 08 - Pg. 192 - #5.8
//Class: CS 113
//Date: 5/17/2021
//Description: This program tells the user the name of the person with the highest score

import java.util.Scanner;

public class Score 
{
    public static void main(String[] args)
    {
        int students;
        String name = "", nameHighest = "";
        double score = 0, scoreHighest = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("This program finds the students with the highest score");
        System.out.print("Enter the number of students: ");
        students = input.nextInt();
        for(int i = 0; i < students; i++)
        {
            System.out.print("Enter the students name and score (EX: John 75):");
            name = input.next();
            score = input.nextDouble();
            if (score > scoreHighest)
            {
                nameHighest = name;
                scoreHighest = score;
            }
        }

        System.out.println(name + " has the highest score of " + score);
    }    
}
