//Written by: Francisco Valadez
//Assignment: Lab 12 - Pg. 150 - #4.17
//Class: CS 113
//Date: 5/29/2021
//Description: This program prompts the user for a year and month in order to let them know
//             how many days are in that month


import java.util.Scanner;

public class month 
{
    //This function checks if january is a leap year or not and returns the correct value
    public static int leapYear(int year)
    {
        //formula to check if its a leap year
        if((year % 4 == 0) || (year % 400 == 0))
        {
            //is a leap year
            return 29;
        }
        else//NOT a leap year
            return 31;
    }

    public static void main(String[] args)
    {
        String month = "";
        int year, days;

        Scanner input = new Scanner(System.in);
        System.out.println("This program displays the days in the month depending on the year");
        System.out.print("Enter a year (EX: 2016): ");
        year = input.nextInt();
        System.out.print("Enter a month (EX: Jan): ");
        month = input.next();

        //This switch case detects what month was inputed by the user
        switch(month)
        {
            case "Jan":
                days = leapYear(year); break; //January can be a leap year with different values so a function checks if it is
            case "Feb" :
                days = 28; break;
            case "Mar" :
                days = 31; break;
            case "Apr" : 
                days = 30; break;
            case "May" : 
                days = 31; break;
            case "Jun" :
                days = 30; break;
            case "Jul" :
                days = 31; break;
            case "Aug" :
                days = 31; break;
            case "Sep" :
                days = 30; break;
            case "Oct" :
                days = 31; break;
            case "Nov" :
                days = 30; break;
            case "Dec" :
                days = 31; break;
            default:
                month = "unknown"; year = 0; days = 0;
        }

        System.out.println(month + " " + year + " has " + days + " days");

    }
}
