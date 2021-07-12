//Written by: Francisco Valadez
//Assignment: HW 08 - Pg. 193 - #5.9
//Class: CS 113
//Date: 5/19/2021
//Description: This program tells the user the name and score of the person with the highest score
//             and the name and score of the person witht the 2nd highest score

import java.util.Scanner;

public class Score 
{
    public static void main(String[] args)
    {
        int students;
        String name = "", nameHighest = "", nameSecond = "None";
        double score = 0, scoreHighest = 0, scoreSecond = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("This program finds the students with the highest score and Second highest score");
        System.out.print("Enter the number of students: ");
        students = input.nextInt(); //gets the number of students

        //loop that gets the names and scores for each student
        for(int i = 0; i < students; i++)
        {
            System.out.print("Enter the students name and score (EX: John 75):");
            name = input.next();
            score = input.nextDouble();
            //stores the highest score
            if (score > scoreHighest)
            {
                nameHighest = name;
                scoreHighest = score;
            }
            //stores the 2nd highest score
            if ((score < scoreHighest) && (score > scoreSecond))
            {
                nameSecond = name;
                scoreSecond = score;
            }
        }

        //prints results
        System.out.println(nameHighest + " has the highest score of " + scoreHighest);
        System.out.println(nameSecond + " has the 2nd highest score of " + scoreSecond);
    }    
}
