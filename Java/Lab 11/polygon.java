//Written by: Francisco Valadez
//Assignment: Lab 11 - Pg. 150 - #4.5
//Class: CS 113
//Date: 5/24/2021
//Description: This program calculates the area of a polygon

import java.util.Scanner;

public class polygon 
{
    public static void main(String[] args)
    {
        double sides, side1, area;
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates the area of a polygon");
        System.out.print("Enter the number of sides: ");
        sides = input.nextDouble();
        System.out.print("Enter the side: ");
        side1 = input.nextDouble();

        area = (sides * Math.pow(side1, 2.0)) / (4 * Math.tan(Math.PI/sides));
        area = ((int)(area * 100)) / 100.0;

        System.out.println("The area of the polygon is " + area);
    }    
}
