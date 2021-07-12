//Written by: Francisco Valadez
//Assignment: HW04 - Pg. 74 - #2.19
//Class: CS 113
//Date: 4/30/2021
//Description: This program propmts the user 3 different points of a triangle
//             in order to compute the area

import java.util.Scanner;

public class Triangle_Area
{
    public static void main(String[] args)
    {
        double x1, y1, x2, y2, x3, y3, area, surface;

        Scanner scan = new Scanner(System.in);
        System.out.println("This program calculates the area of a trianle.");
        System.out.print("Enter the three points for a triable: ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        x3 = scan.nextDouble();
        y3 = scan.nextDouble();

        //surface = (x1 * y2 + x2 * y3 + x3*y1 - y1 *x2 - y2*x3 - y3 * x1) / 2; //NOT WORKING?????
        //area = surface * (surface);
        //area = Math.sqrt(area);      
        area = Math.abs(.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))); //results are negative but area is alwasy positive

        System.out.println("The area of the triangle is: " + area);
        
        
    }
}