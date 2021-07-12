//Written by: Francisco Valadez
//Assignment: HW03 - Pg. 70 - #2.7
//Class: CS 113
//Date: 4/26/2021
//Description: This program shows the user the number of days and years based on the amount of minutes they input.

import java.util.Scanner;

public class Number_of_Years
{
    public static void main(String[] args)
    {
        int minutes, hours, days, years;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        minutes = scan.nextInt();

        hours = minutes / 60 - (minutes % 60);
        days = hours / 24;
        years = (days / 365);
        days = (minutes / 1440) % 365;

        //System.out.println("hours: " + hours + " days: " + days + " years: " + years);
        System.out.println( minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}