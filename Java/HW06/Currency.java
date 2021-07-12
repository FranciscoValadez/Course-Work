//Written by: Francisco Valadez
//Assignment: HW06 - Pg. 116 - #3.31
//Class: CS 113
//Date: 5/15/2021
//Description: This program prompts the user for a conversion rate and is able to convert
//             from US Dollars to chinese RMB and vise versa

import java.util.Scanner;

public class Currency 
{
    public static void main(String[] args)
    {
        double yuan, dollar, exchange;
        int selection;
        
        Scanner input = new Scanner(System.in);
        System.out.println("This program can convert US Dollars to Chinese RMB and vise versa.");
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        exchange = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        selection = input.nextInt();
        if (selection == 0)
        {
            System.out.print("Enter the dollar amount: ");
            dollar = input.nextDouble();
            yuan = exchange * dollar;
            System.out.println("$" + ((int)(dollar*100))/100.0 + " is " + ((int)(yuan * 100))/100.0  + " yuan");

        }
        else
        {
            System.out.print("Enter the RMB amount: ");
            yuan = input.nextDouble();
            dollar = yuan/exchange;
            System.out.println(((int)(yuan * 100))/100.0 + " yuan is $" + ((int)(dollar*100))/100.0);
        }
    }
}
