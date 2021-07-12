//Written by: Francisco Valadez
//Assignment: Lab 13 - Pg. 276 - #7.1
//Class: CS 113
//Date: 5/31/2021
//Description: This program prompts the user for the amount of students and each students score
//              then prints out the correct letter grade

import java.util.Scanner;

public class grades 
{
    //This function returns the correct letter grade
    public static String letter(int[] score, int currentScore)
    {
        int highest = score[0];
        //this loop finds the highest score
        for(int i = 0; i < score.length; i++)
        {
            if(highest < score[i])
                highest = score[i];
        }
        //this switch case returns the correct letter grade based
        //on the score that was passed to this function
        if(currentScore >= highest - 10)
            return "A";
        else if(currentScore >= highest - 20)
            return "B";
        else if(currentScore >= highest - 30)
            return "C";
        else if(currentScore >= highest - 40)
            return "D";
        else
            return "F";
    }
    public static void main(String[] args)
    {
        int[] score = new int[30];
        int students;

        Scanner input = new Scanner(System.in);
        System.out.println("This program assigns grades based on the students scores.");
        System.out.print("Enter the number of studends: ");
        students = input.nextInt();
        //gets the scores
        System.out.print("Enter " + students + " scores: ");
        for(int i = 0; i < students; i++)
        {
            score[i] = input.nextInt();
        }
        //Prints the scores
        for(int i = 0; i < students; i++)
        {
            System.out.println("Student "+ i + " score is " + score[i] + " and grade is " + letter(score, score[i]) );
        }
    }
}
