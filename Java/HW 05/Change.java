//Written by: Francisco Valadez
//Assignment: HW05 - Pg. 109 - #3.7
//Class: CS 113
//Date: 5/5/2021
//Description: This program prompts the user for their change and displays
//             the nonzero amount due.

import java.util.Scanner;

public class Change 
{
    public static void main(String[] args)
    {
        double change;
        int total, dollars, quarters, dimes, nickels, pennies;

        //Welcome message
        Scanner scan = new Scanner(System.in);
        System.out.println("This program displays the amount of change you will recieve.");
        System.out.print("Input the amount of change due (EX: 1.36): ");
        change = scan.nextDouble();

        //The Math
        total = (int)(change * 100);
        dollars = total / 100;
        total %= 100;
        quarters = total / 25;
        total %= 25;
        dimes = total / 10;
        total %= 10;
        nickels = total / 5;
        pennies = total % 5;
        
        //Logic for finding if its singular or plural amounts
        if ((dollars > 0) && (quarters >0) && (dimes > 0) && (nickels > 0) && (pennies > 0))
            System.out.println("Total change: ");
        else
            System.out.println("You did not recieve any change!");
        if (dollars > 0)
        {
            if (dollars > 1) 
                System.out.println(dollars + " Dollars");
            else 
                System.out.println(dollars + " Dollar");
                
        }
        if (quarters > 0)
        {
            if (quarters > 1) 
                System.out.println(quarters + " Quarters");
            else 
                System.out.println(quarters + " Quarter");
                
        }
        if (dimes > 0)
        {
            if (dimes > 1) 
                System.out.println(dimes + " Dimes");
            else 
                System.out.println(dimes + " Dime");
                
        }
        if (nickels > 0)
        {
            if (nickels > 1) 
                System.out.println(nickels + " Nickles");
            else 
                System.out.println(nickels + " Nickle");
                
        }
        if (pennies > 0)
        {
            if (pennies > 1) 
                System.out.println(pennies + " Pennies");
            else 
                System.out.println(pennies + " Penny");
                
        }
    }
}