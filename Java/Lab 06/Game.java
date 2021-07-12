//Written by: Francisco Valadez
//Assignment: Lab06 - Pg. 111 - #3.17
//Class: CS 113
//Date: 5/14/2021
//Description: This program prompts allows the user to play rock paper scissors and prompts them to make a selction
//in order to play a round against the CPU

import java.util.Scanner;

public class Game 
{
    public static void main(String[] args)
    {
        int PLAYER, CPU;
        String CPUSelection = "", PSelection = "";

        Scanner input = new Scanner(System.in);
        System.out.println("This program lets you play Rock, Paper, Scissors! \nMake your selection below.");
        System.out.print("scissor (0), rock (1), paper (2): ");
        PLAYER = input.nextInt();
        CPU = (int)(Math.random() * 10);

        //checks if the made a valid selection
        if ((PLAYER < 0)||(PLAYER > 2))
        {
            System.out.println("Invalid selection! \nGoodbye.");
        }
        else
        {
            //Takes the random number and sets it 0,1 or 2
            if (CPU < 3)
                CPU = 0;
            else if (CPU < 6)
                CPU  = 1;
            else{
                CPU = 2;
            }
            
            //Switch case for the Player and CPU that sets the string to what the selected
            switch(PLAYER)
            {
                case 0: PSelection = "scissors"; break;
                case 1: PSelection = "rock"; break;
                case 2: PSelection = "paper"; break;
            }
            switch(CPU)
            {
                case 0: CPUSelection = "scissors"; break;
                case 1: CPUSelection = "rock"; break;
                case 2: CPUSelection = "paper"; break;
            }

            //If statemets that are the game 'logic'
            if (PLAYER == CPU)
                System.out.println("The coumputer is " +  CPUSelection + ". You are " + PSelection + " too. Its a draw.");
            else if (PLAYER < CPU)
                System.out.println("The coumputer is " +  CPUSelection + ". You are " + PSelection + ". You lost.");
            else if(PLAYER > CPU)
                System.out.println("The coumputer is " +  CPUSelection + ". You are " + PSelection + ". You Won!");
        }
    }    
}
