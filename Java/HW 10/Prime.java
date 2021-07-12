//Written by: Francisco Valadez
//Assignment: HW 10 - Pg. 236 - #6.10
//Class: CS 113
//Date: 5/23/2021
//Description: This program finds the number of prime numbers less than 10000

public class Prime 
{
    public static boolean isPrime(int number)
    {
        for(int divisor = 2; divisor <= number / 2; divisor++)
        {
            if(number % divisor == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int total = 0;
        System.out.println("This program finds the number of prime numbers lesss than 10000");

        for(int i = 0; i <=10000; i++)
        {
            if(isPrime(i))
                ++total;
        }
        System.out.println("Total number of Prime numbers between 0 and 10000: " + total);

    }    
}
