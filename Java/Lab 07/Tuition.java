//Written by: Francisco Valadez
//Assignment: Lab 07 - Pg. 193 - #5.7
//Class: CS 113
//Date: 5/10/2021
//Description: This program calculates a 4 year tution after the 10th year ; years 11 = 14

public class Tuition 
{
    public static void main(String[] args)
    {   
        double tuition = 10000, increase = .05, year_cost = 0, total = 0;

        System.out.println("This program calculates the cost of a 4 year tuition that begins after the 10th year.");
        
        //This for loop calculates the cost of each year and includes the yearly increase
        for(int x = 2; x < 15; x++)
        {   
            year_cost = tuition + (tuition * increase);
            tuition = year_cost;
            //System.out.println("Year " + x + " : " + year_cost); //Prints the years cost
            if (x > 10)
                total += year_cost;
        }

        System.out.println("The total cost for attending 4 years after the 10th year is: $" + total);
    }
}
