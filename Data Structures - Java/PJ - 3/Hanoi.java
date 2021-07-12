//Author:       Francisco Valadez
//Date:         5/12/2021
//Purpose:      This program solves the towers of hanoi problem by getting the number of disks
//              from a user and then uses recursion to move those disk from pole A to pole B

import java.util.Scanner;

public class Hanoi
{
    public static void main(String[] args)    
    {
        int disks;

        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to play the Towers of Hanoi Game of Francisco Valadez!\n" + 
                         "1=============================================\n" + 
                         ">> Please enter the number of disks for this game: ");
        disks = input.nextInt();
        //checks if the number is negative
        if ((disks == 0) || (disks <= 0))
            System.out.println("No Disks to play with.");
        else
        //sends to the amount to a method that will 'move' the disks to pole B
        solution(disks, 'A', 'B', 'C'); 
        
        //System.out.println((int)(Math.pow(2, disks) - 1));    //used for troubleshooting

        System.out.println("2=============================================\n" + 
                           "Thank you for playing the Towers of Hanoi Game of Francisco Valadez.\n" + 
                           "3=============================================");

    }

    //Recursion method
    static void solution(int disks, char tower1, char tower3, char tower2)
    {
        if (disks == 1)
            System.out.println("Move top disk from pole " + tower1  + " to pole " + tower3);
        else
        {
            //Recursion all the way down
            solution(disks - 1 , tower1, tower2, tower3);
            System.out.println("Move top disk from pole " + tower1 + " to pole " + tower3);
            solution(disks - 1, tower2, tower3, tower1);
        }
    }
}
