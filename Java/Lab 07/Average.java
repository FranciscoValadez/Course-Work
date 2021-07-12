//Written by: Francisco Valadez
//Assignment: Lab 07 - Pg. 192 - #5.1
//Class: CS 113
//Date: 5/10/2021
//Description: This program takes integers that the user inputs then adds them to show the total and
//             also counts the total number of negative and positive numbers that were inputed

import java.util.Scanner;

public class Average 
{
    public static void main(String[] args)
    {
        int number, positive = 0, negative = 0;
        Double total = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("This program adds integers and shows the total and counts the amount of positive/negative numbers.");
        System.out.print("Enter an integer, the input ends if it is 0: ");
        number = input.nextInt();
        //Checks if the number 0 is entered
        if (number != 0)
        {
            //keeps running until 0 is entered
            for(int x = 0; number != 0; x++)
            {
                if (number > 0)
                    ++positive;
                else if (number < 0)
                    ++negative;
                total += number;
                number = input.nextInt();
            }
            //Prints the results after the user exits the loop
            System.out.println("The number of positives is " + positive);
            System.out.println("The number of negative is " + negative);
            System.out.println("The total is " + total);
            System.out.println("The average is " + (total/(positive + negative)));
        }
        else
        System.out.println("No numbers are entered except 0");

        
    }   
}
