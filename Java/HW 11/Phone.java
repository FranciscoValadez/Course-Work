//Written by: Francisco Valadez
//Assignment: HW 11 - Pg. 150 - #4.15
//Class: CS 113
//Date: 5/26/2021
//Description: This program displays the corresponding number of a letter

import java.util.Scanner;

public class Phone 
{
    public static void main(String[] args)
    {
        String letter = "";

        Scanner input = new Scanner(System.in);
        System.out.println("This program displays the corresponding number for a letter");
        System.out.print("Enter a letter: ");
        letter = input.next();
        
        //These else if statements check the value of the users input
        if(letter.equals("A") || letter.equals("a") || letter.equals("B") || letter.equals("b") || letter.equals("C") || letter.equals("c"))
        {
            System.out.println("The corresponding number is " + 2);
        }
        else if(letter.equals("D") || letter.equals("d") || letter.equals("E") || letter.equals("e") || letter.equals("F") || letter.equals("f"))
        {
            System.out.println("The corresponding number is " + 3);
        }
        else if(letter.equals("G") || letter.equals("g") || letter.equals("H") || letter.equals("h") || letter.equals("I") || letter.equals("i"))
        {
            System.out.println("The corresponding number is " + 4);
        }
        else if(letter.equals("J") || letter.equals("j") || letter.equals("K") || letter.equals("k") || letter.equals("L") || letter.equals("l"))
        {
            System.out.println("The corresponding number is " + 5);
        }
        else if(letter.equals("M") || letter.equals("m") || letter.equals("N") || letter.equals("n") || letter.equals("O") || letter.equals("o"))
        {
            System.out.println("The corresponding number is " + 6);
        }
        else if(letter.equals("P") || letter.equals("p") || letter.equals("Q") || letter.equals("q") || letter.equals("R") || letter.equals("r") || letter.equals("S") || letter.equals("s"))
        {
            System.out.println("The corresponding number is " + 7);
        }
        else if(letter.equals("T") || letter.equals("t") || letter.equals("U") || letter.equals("u") || letter.equals("V") || letter.equals("v"))
        {
            System.out.println("The corresponding number is " + 8);
        }
        else if(letter.equals("W") || letter.equals("w") || letter.equals("X") || letter.equals("x") || letter.equals("Y") || letter.equals("y") || letter.equals("Z") || letter.equals("z"))
        {
            System.out.println("The corresponding number is " + 9);
        }
        else if(letter.equals(" "))
        {
            System.out.println("The corresponding number is " + 0);
        }
        else
            System.out.println(letter + " is an invalid input");
        
    }    
}
