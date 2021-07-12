//Written by: Francisco Valadez
//Assignment: HW12 - Pg. 150 - #4.23
//Class: CS 113
//Date: 5/31/2021
//Description: This program propmts the user for an employees information
//             and then uses that information to display a payroll statement

import java.util.Scanner;

public class payroll 
{
    public static void main(String[] args)
    {
        String name = "";
        double payRate, taxFed, taxState, gross, fedHold, stateHold, hours;

        //gets the users inpu
        Scanner input = new Scanner(System.in);
        System.out.println("This program prints a payroll statement.");
        System.out.print("Enter employee's name: ");
        name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        taxFed = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        taxState = input.nextDouble();
        System.out.println();

        //formuals for calculating stuff
        gross = payRate*hours;
        fedHold = gross * taxFed;
        stateHold = gross * taxState;

        //prints and formats for the user to see below
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + gross);
        System.out.println("Deductions:\n" + 
                           "\tFederal Witholding (" + taxFed*100 + "%): " + ((int)((fedHold)*100))/100.0 + "\n" +
                           "\tStae  withholding: (" + taxState*100 + "%): " + ((int)((stateHold)*100))/100.0 + "\n" + 
                           "\tTotal Deductions: " + ((int)((stateHold + fedHold)*100))/100.0);
        System.out.println("Net Pay: $" + ((int)((gross - stateHold - fedHold)*100))/100.0);

    } 
}
