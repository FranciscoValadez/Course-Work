//Written by: Francisco Valadez
//Assignment: Lab 08 - Pg. 192 - #5.3
//Class: CS 113
//Date: 5/17/2021
//Description: This programs prrints a table that displays the the converted weight of both kilograms and pounds

public class Conversion 
{
    public static void main(String[] args)
    {
        System.out.println("This program converts from kilograms to pounds.");
        System.out.println("Kilograms\tPounds");
        for(int i = 1; i < 200; i++)
        {
            if(i%2 != 0)
            System.out.println(i + "\t\t" + ((int)((i*2.2)*10))/10.0);
        }
    }
}
