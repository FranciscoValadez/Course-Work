//Written by: Francisco Valadez
//Assignment: Lab 11 - Pg. 150 - #4.1
//Class: CS 113
//Date: 5/24/2021
//Description: This program calculates the area of a pentagon

import java.util.Scanner;

public class pentagon 
{
    public static void main(String[] args)
    {
        double radius, side, area;
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates the area of a pentagon");
        System.out.print("Enter the length from the venter to the vertex: ");
        radius = input.nextDouble();

        side = 2 * radius * (Math.sin((Math.PI)/5));
        area = (5 * Math.pow(side, 2))/ (4 * (Math.tan(Math.PI/5)));
        area = ((int)(area * 100)) / 100.0;

        System.out.println("The area of the pentagon " + area);
    }    
}
