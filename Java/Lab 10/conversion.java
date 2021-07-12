//Written by: Francisco Valadez
//Assignment: Lab 10 - Pg. 235 - #6.8
//Class: CS 113
//Date: 5/21/2021
//Description: This program prints a table of converted values of celsius to fahrenheit and vice versa

public class conversion 
{
    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius)
    {
        return ((9.0/5) * celsius)+ 32;
    }

    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit)
    {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void main(String[] args)
    {
        int Fahrenheit = 120;

        System.out.println("This program converts from celcisu to fahrenheit and vice versa!");
        System.out.println("Celsius\t\tFahrenheit\t\t|\t\tFahrenheit\t\tCelsius\n" + 
                          "____________________________________________________________________________________________");
        //This for loop keeps printing the values
        for(int celsius = 40; celsius > 30; celsius--)
        {
            //The values of celsius and fahrenheit are passed to the correct method then the reutrned value is printed
            System.out.println(celsius + "\t\t" + ((int)(celsiusToFahrenheit(celsius)* 100))/100.0 + "\t\t\t|\t\t" +  Fahrenheit + "\t\t" + ((int)(fahrenheitToCelsius(Fahrenheit)* 100))/100.0);
            //Decrements by 10 to keep the table formated as requested
            Fahrenheit -= 10;
        }
    }    
}
