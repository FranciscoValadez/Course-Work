//Written by: Francisco Valadez
//Assignment: HW 10 - Pg. 236 - #6.9
//Class: CS 113
//Date: 5/23/2021
//Description: This program prints a table that converts from feet to meters and vice versa

public class conversion 
{
    public static double footToMeter(double foot)
    {
        return  0.305 * foot;
    }
    
    public static double meterToFoot(double meter)
    {
        return  3.279 * meter;
    }
    public static void main(String[] args)
    {
        double meter = 20;
        System.out.println("This program prints a table that converts from feet to meters and meters to feet");
        System.out.println("Feet\t\tMeters\t\t|\t\tMeters\t\tFeet\n" + 
                          "____________________________________________________________________________________________");
        //This for loop keeps printing the values
        for(double foot = 1;  foot <= 10; foot++)
        {
            //The values of celsius and fahrenheit are passed to the correct method then the reutrned value is printed
            System.out.println(foot + "\t\t" + ((int)(footToMeter(foot)* 1000))/1000.0 + "\t\t\t|\t\t" +  meter + "\t\t" + ((int)(meterToFoot(meter)* 100))/100.0);
            //Decrements by 10 to keep the table formated as requested
            meter += 5;
        }

    }    
}


